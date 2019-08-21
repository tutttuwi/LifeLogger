<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- Struts2 tag library -->
<!-- HTML5 Declaration -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン | LIFE LOGGER</title>
<!-- favicon -->
<link rel="shortcut icon" href="/LifeLogger/assets/img/brand128.ico" />
<!-- Tell the browser to be responsive to screen width -->
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

<!-- Font Awesome -->
<link rel="stylesheet" href="/LifeLogger/assets/dist/AdminLTE/plugins/fontawesome-free/css/all.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- icheck bootstrap -->
<link rel="stylesheet" href="/LifeLogger/assets/dist/AdminLTE/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="/LifeLogger/assets/dist/AdminLTE/css/adminlte.min.css">
<!-- Google Font: Source Sans Pro -->
<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
<!-- Custom CSS -->
<link href="/LifeLogger/assets/css/style.css" rel="stylesheet">

<!-- TODO: FontSizeを全体的に下げる -->
</head>

<body class="hold-transition login-page">
    <div class="login-box">
        <div class="login-logo mb-4">
            <h1><a href="/LifeLogger"><b>LIFE LOGGER</b></a></h1>
        </div>
        <!-- /.login-logo -->
        <div class="card">
            <div class="card-body login-card-body">
                <p class="login-box-msg">ログインしてください。</p>
                <!-- Error message -->
                <s:if test="hasActionErrors() || hasFieldErrors()">
                    <div class="alert alert-danger alert-dismissible" role="alert">
                        <button type="button" class="close" data-dismiss="alert">
                            <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                        </button>
                        <s:iterator var="actionError" value="actionErrors">
                            ${actionError}
                            <br>
                        </s:iterator>
                        <s:iterator var="entry" value="%{fieldErrors.entrySet()}">
                            <s:iterator var="val" value="%{#entry.getValue()}">
                                ${val}
                                <br>
                            </s:iterator>
                        </s:iterator>
                    </div>
                </s:if>


                <s:form action="login_doLogin" method="post">
                    <div class="input-group mb-3">
                        <input id="id" name="id" type="text" class="form-control" placeholder="ユーザID" maxlength="32" value="${id}" />
                        <div class="input-group-append">
                            <div class="input-group-text">
                                <span class="fa fa-user"></span>
                            </div>
                        </div>
                    </div>
                    <div class="input-group mb-3">
                        <input id="pw" name="pw" type="password" class="form-control" placeholder="パスワード" maxlength="32" />
                        <div class="input-group-append">
                            <div class="input-group-text">
                                <span class="fas fa-lock"></span>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-8">
                            <div class="icheck-primary">
                            <%-- TODO: 定数管理 isKeepLoginStatus --%>
                                <input id="isKeepLoginStatus" name="isKeepLoginStatus" type="checkbox">
                                <label for="isKeepLoginStatus" class="form-check-label">ログイン情報を保存する</label>
                            </div>
                        </div>
                        <!-- /.col -->
                        <div class="col-4">
                            <button type="submit" class="btn btn-primary btn-block btn-flat">ログイン</button>
                        </div>
                        <!-- /.col -->
                    </div>
                    <s:token/>
                </s:form>

                <div class="social-auth-links text-center mb-3">
                    <p>- OR -</p>
                    <!-- TODO: ソーシャルボタン実装 -->
                    <a href="#" class="btn btn-block btn-primary"> <i class="fab fa-facebook mr-2"></i> Sign in using Facebook
                    </a> <a href="#" class="btn btn-block btn-danger"> <i class="fab fa-google-plus mr-2"></i> Sign in using Google+
                    </a>
                </div>
                <!-- /.social-auth-links -->

                <p class="mb-1">
                    <a href="#">パスワードを忘れた方はこちら</a>
                </p>
                <p class="mb-0">
                    <a href="#" class="text-center">登録がまだの方はこちら</a>
                </p>
            </div>
            <!-- /.login-card-body -->
        </div>
    </div>
    <!-- /.login-box -->

    <!-- jQuery -->
    <script src="/LifeLogger/assets/dist/AdminLTE/plugins/jquery/jquery.min.js"></script>
    <!-- Bootstrap 4 -->
    <script src="/LifeLogger/assets/dist/AdminLTE/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>