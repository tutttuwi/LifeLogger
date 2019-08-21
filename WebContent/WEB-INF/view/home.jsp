<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- Struts2 tag library -->
<!-- HTML5 Declaration -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LifeLogger Application | Log in</title>
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
</head>
<!-- body class : layout-top-nav -> singlepage layout -->
<body class="sidebar-mini" style="height: auto;">
    <div class="wrapper">
        <!-- Navbar -->
        <s:include value="included/header_main.jsp"/>
        <!-- /.navbar -->

        <!-- Main Sidebar Container -->
        <s:include value="included/sidebar_main.jsp"/>

        <!-- Content Wrapper. Contains page content -->
        <div class="content-wrapper" style="min-height: 971.94px;">
            <!-- Content Header (Page header) -->
            <s:include value="included/content_header.jsp" />
            <!-- /.content-header -->

            <!-- Main content -->
            <div class="content">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="card">
                                <div class="card-header border-0">
                                    <div class="d-flex justify-content-between">
                                        <h3 class="card-title">Online Store Visitors</h3>
                                        <a href="javascript:void(0);">View Report</a>
                                    </div>
                                </div>
                                <div class="card-body">
                                    <div class="d-flex">
                                        <p class="d-flex flex-column">
                                            <span class="text-bold text-lg">820</span> <span>Visitors Over Time</span>
                                        </p>
                                        <p class="ml-auto d-flex flex-column text-right">
                                            <span class="text-success"> <i class="fas fa-arrow-up"></i> 12.5%
                                            </span> <span class="text-muted">Since last week</span>
                                        </p>
                                    </div>
                                    <!-- /.d-flex -->

                                    <div class="position-relative mb-4">
                                        <div class="chartjs-size-monitor">
                                            <div class="chartjs-size-monitor-expand">
                                                <div class=""></div>
                                            </div>
                                            <div class="chartjs-size-monitor-shrink">
                                                <div class=""></div>
                                            </div>
                                        </div>
                                        <canvas id="visitors-chart" height="200" width="406" class="chartjs-render-monitor" style="display: block; width: 406px; height: 200px;"></canvas>
                                    </div>

                                    <div class="d-flex flex-row justify-content-end">
                                        <span class="mr-2"> <i class="fas fa-square text-primary"></i> This Week
                                        </span> <span> <i class="fas fa-square text-gray"></i> Last Week
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <!-- /.card -->

                            <div class="card">
                                <div class="card-header border-0">
                                    <h3 class="card-title">Products</h3>
                                    <div class="card-tools">
                                        <a href="#" class="btn btn-tool btn-sm"> <i class="fas fa-download"></i>
                                        </a> <a href="#" class="btn btn-tool btn-sm"> <i class="fas fa-bars"></i>
                                        </a>
                                    </div>
                                </div>
                                <div class="card-body p-0">
                                    <table class="table table-striped table-valign-middle">
                                        <thead>
                                            <tr>
                                                <th>Product</th>
                                                <th>Price</th>
                                                <th>Sales</th>
                                                <th>More</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td><img src="/LifeLogger/assets/dist/AdminLTE/img/default-150x150.png" alt="Product 1" class="img-circle img-size-32 mr-2"> Some Product</td>
                                                <td>$13 USD</td>
                                                <td><small class="text-success mr-1"> <i class="fas fa-arrow-up"></i> 12%
                                                </small> 12,000 Sold</td>
                                                <td><a href="#" class="text-muted"> <i class="fas fa-search"></i>
                                                </a></td>
                                            </tr>
                                            <tr>
                                                <td><img src="/LifeLogger/assets/dist/AdminLTE/img/default-150x150.png" alt="Product 1" class="img-circle img-size-32 mr-2"> Another Product</td>
                                                <td>$29 USD</td>
                                                <td><small class="text-warning mr-1"> <i class="fas fa-arrow-down"></i> 0.5%
                                                </small> 123,234 Sold</td>
                                                <td><a href="#" class="text-muted"> <i class="fas fa-search"></i>
                                                </a></td>
                                            </tr>
                                            <tr>
                                                <td><img src="/LifeLogger/assets/dist/AdminLTE/img/default-150x150.png" alt="Product 1" class="img-circle img-size-32 mr-2"> Amazing Product</td>
                                                <td>$1,230 USD</td>
                                                <td><small class="text-danger mr-1"> <i class="fas fa-arrow-down"></i> 3%
                                                </small> 198 Sold</td>
                                                <td><a href="#" class="text-muted"> <i class="fas fa-search"></i>
                                                </a></td>
                                            </tr>
                                            <tr>
                                                <td><img src="/LifeLogger/assets/dist/AdminLTE/img/default-150x150.png" alt="Product 1" class="img-circle img-size-32 mr-2"> Perfect Item <span
                                                    class="badge bg-danger">NEW</span></td>
                                                <td>$199 USD</td>
                                                <td><small class="text-success mr-1"> <i class="fas fa-arrow-up"></i> 63%
                                                </small> 87 Sold</td>
                                                <td><a href="#" class="text-muted"> <i class="fas fa-search"></i>
                                                </a></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <!-- /.card -->
                        </div>
                        <!-- /.col-md-6 -->
                        <div class="col-lg-6">
                            <div class="card">
                                <div class="card-header border-0">
                                    <div class="d-flex justify-content-between">
                                        <h3 class="card-title">Sales</h3>
                                        <a href="javascript:void(0);">View Report</a>
                                    </div>
                                </div>
                                <div class="card-body">
                                    <div class="d-flex">
                                        <p class="d-flex flex-column">
                                            <span class="text-bold text-lg">$18,230.00</span> <span>Sales Over Time</span>
                                        </p>
                                        <p class="ml-auto d-flex flex-column text-right">
                                            <span class="text-success"> <i class="fas fa-arrow-up"></i> 33.1%
                                            </span> <span class="text-muted">Since last month</span>
                                        </p>
                                    </div>
                                    <!-- /.d-flex -->

                                    <div class="position-relative mb-4">
                                        <div class="chartjs-size-monitor">
                                            <div class="chartjs-size-monitor-expand">
                                                <div class=""></div>
                                            </div>
                                            <div class="chartjs-size-monitor-shrink">
                                                <div class=""></div>
                                            </div>
                                        </div>
                                        <canvas id="sales-chart" height="200" style="display: block; width: 406px; height: 200px;" width="406" class="chartjs-render-monitor"></canvas>
                                    </div>

                                    <div class="d-flex flex-row justify-content-end">
                                        <span class="mr-2"> <i class="fas fa-square text-primary"></i> This year
                                        </span> <span> <i class="fas fa-square text-gray"></i> Last year
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <!-- /.card -->

                            <div class="card">
                                <div class="card-header border-0">
                                    <h3 class="card-title">Online Store Overview</h3>
                                    <div class="card-tools">
                                        <a href="#" class="btn btn-sm btn-tool"> <i class="fas fa-download"></i>
                                        </a> <a href="#" class="btn btn-sm btn-tool"> <i class="fas fa-bars"></i>
                                        </a>
                                    </div>
                                </div>
                                <div class="card-body">
                                    <div class="d-flex justify-content-between align-items-center border-bottom mb-3">
                                        <p class="text-success text-xl">
                                            <i class="ion ion-ios-refresh-empty"></i>
                                        </p>
                                        <p class="d-flex flex-column text-right">
                                            <span class="font-weight-bold"> <i class="ion ion-android-arrow-up text-success"></i> 12%
                                            </span> <span class="text-muted">CONVERSION RATE</span>
                                        </p>
                                    </div>
                                    <!-- /.d-flex -->
                                    <div class="d-flex justify-content-between align-items-center border-bottom mb-3">
                                        <p class="text-warning text-xl">
                                            <i class="ion ion-ios-cart-outline"></i>
                                        </p>
                                        <p class="d-flex flex-column text-right">
                                            <span class="font-weight-bold"> <i class="ion ion-android-arrow-up text-warning"></i> 0.8%
                                            </span> <span class="text-muted">SALES RATE</span>
                                        </p>
                                    </div>
                                    <!-- /.d-flex -->
                                    <div class="d-flex justify-content-between align-items-center mb-0">
                                        <p class="text-danger text-xl">
                                            <i class="ion ion-ios-people-outline"></i>
                                        </p>
                                        <p class="d-flex flex-column text-right">
                                            <span class="font-weight-bold"> <i class="ion ion-android-arrow-down text-danger"></i> 1%
                                            </span> <span class="text-muted">REGISTRATION RATE</span>
                                        </p>
                                    </div>
                                    <!-- /.d-flex -->
                                </div>
                            </div>
                        </div>
                        <!-- /.col-md-6 -->
                    </div>
                    <!-- /.row -->
                </div>
                <!-- /.container-fluid -->
            </div>
            <!-- /.content -->
        </div>
        <!-- /.content-wrapper -->

        <!-- Control Sidebar -->
        <s:include value="included/sidebar_control.jsp" />
        <!-- /.control-sidebar -->

        <!-- Main Footer -->
        <%@ include file="included/footer.jsp"%>

        <div id="sidebar-overlay"></div>
    </div>
    <!-- ./wrapper -->

    <!-- REQUIRED SCRIPTS -->

    <!-- jQuery -->
    <script src="/LifeLogger/assets/dist/AdminLTE/plugins/jquery/jquery.min.js"></script>
    <!-- Bootstrap 4 -->
    <script src="/LifeLogger/assets/dist/AdminLTE/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- AdminLTE -->
    <script src="/LifeLogger/assets/dist/AdminLTE/js/adminlte.js"></script>
    <!-- OPTIONAL SCRIPTS -->
    <script src="/LifeLogger/assets/dist/AdminLTE/plugins/chart.js/Chart.min.js"></script>
    <script src="/LifeLogger/assets/dist/AdminLTE/js/demo.js"></script>
    <script src="/LifeLogger/assets/dist/AdminLTE/js/pages/dashboard3.js"></script>

</body>
</html>