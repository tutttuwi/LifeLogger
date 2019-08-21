package me.tutttuwi.lifelogger;

import java.time.LocalDateTime;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import me.tutttuwi.lifelogger.constants.PropKey;
import me.tutttuwi.lifelogger.constants.ResultCodeAction;
import me.tutttuwi.lifelogger.util.ConfigLoader;

public class MaintenanceCheckInterceptor extends MethodFilterInterceptor {

  @Override
  protected String doIntercept(ActionInvocation invocation) throws Exception {

    int mainteDayOfWeek =
        Integer.parseInt(ConfigLoader.getString(PropKey.MAINTENANCE_DAYOFWEEK.KEY));
    LocalDateTime current = LocalDateTime.now();
    if (current.getDayOfWeek().getValue() != mainteDayOfWeek) {
      return invocation.invoke();
    }

    String[] startTimeArray = ConfigLoader.getString(PropKey.MAINTENANCE_START.KEY).split(":");
    int startHour = Integer.parseInt(startTimeArray[0]);
    int startMinute = Integer.parseInt(startTimeArray[1]);
    String[] endTimeArray = ConfigLoader.getString(PropKey.MAINTENANCE_END.KEY).split(":");
    int endHour = Integer.parseInt(endTimeArray[0]);
    int endMinute = Integer.parseInt(endTimeArray[1]);

    LocalDateTime start = LocalDateTime.of(current.getYear(), current.getMonth(),
        current.getDayOfMonth(), startHour, startMinute);
    LocalDateTime end = LocalDateTime.of(current.getYear(), current.getMonth(),
        current.getDayOfMonth(), endHour, endMinute);

    if (start.isAfter(current) && end.isBefore(current)) {
      // Maintenance TIME
      return ResultCodeAction.MAINTENANCE.CODE;
    }

    return invocation.invoke();
  }

}
