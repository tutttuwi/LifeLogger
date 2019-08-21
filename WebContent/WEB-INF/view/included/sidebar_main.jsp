<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%><!-- Struts2 tag library -->
<aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="#" class="brand-link"> <img src="/LifeLogger/assets/img/home-256x256.jpg " alt="AdminLTE Logo" class="brand-image elevation-3" style="opacity: .8 border-radius:5px"> <span
        class="brand-text font-weight-light">LIFE LOGGER</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
        <!-- Sidebar user panel (optional) -->
        <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
                <img src="/LifeLogger/assets/img/user-default-256x256.jpg " class="img-circle elevation-2" alt="User Image">
            </div>
            <div class="info">
                <!-- Inject USER NAME -->
                <a href="#" class="d-block">Test User</a>
            </div>
        </div>

        <!-- Sidebar Menu -->
        <nav class="mt-2">
            <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
               <!-- TODO: ダッシュボードカスタマイズ機能実装 追加、削除、配置のカスタマイズ -->
                <li class="nav-item has-treeview menu-open"><a href="#" class="nav-link active"> <i class="nav-icon fas fa-tachometer-alt"></i>
                        <p>
                            ダッシュボード <i class="right fas fa-angle-left"></i>
                        </p>
                </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>My Dashboard (1)</p>
                        </a></li>
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>My Dashboard (2)</p>
                        </a></li>
                    </ul></li>
                <li class="nav-item has-treeview"><a href="#" class="nav-link"> <i class="nav-icon fas fa-asterisk"></i>
                        <p>
                             ライフログ <i class="right fas fa-angle-left"></i>
                        </p>
                </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>TimeLine</p>
                        </a></li>
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>GPS Log</p>
                        </a></li>
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>SNS Log</p>
                        </a></li>
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>Daily</p>
                        </a></li>
                    </ul></li>
                <li class="nav-item has-treeview"><a href="#" class="nav-link"> <i class="nav-icon fas fa-edit"></i>
                        <p>
                            ユーザ情報 <i class="fas fa-angle-left right"></i>
                        </p>
                </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>ユーザ情報編集</p>
                        </a></li>
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>ID連携</p>
                        </a></li>
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>カスタマイズ</p>
                        </a></li>
                    </ul></li>
                <li class="nav-item"><a href="#" class="nav-link"> <i class="nav-icon fas fa-table"></i>
                        <p>スケジュール</p>
                </a></li>
                <li class="nav-item"><a href="#" class="nav-link"> <i class="nav-icon fas fa-table"></i>
                        <p>タスク</p>
                </a></li>
                <li class="nav-header">その他</li>
                <li class="nav-item"><a href="#" class="nav-link"> <i class="nav-icon fas fa-calendar-alt"></i>
                        <p>
                            カレンダー  <span class="badge badge-info right">2</span>
                        </p>
                </a></li>
                <li class="nav-item has-treeview"><a href="#" class="nav-link"> <i class="nav-icon far fa-envelope"></i>
                        <p>
                            メールボックス <i class="fas fa-angle-left right"></i>
                        </p>
                </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>Inbox</p>
                        </a></li>
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>Compose</p>
                        </a></li>
                        <li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>Read</p>
                        </a></li>
                    </ul></li>
                <li class="nav-header">システム</li>
                <li class="nav-item"><a href="#" class="nav-link"> <i class="nav-icon fas fa-file"></i>
                        <p>システム説明</p>
                </a></li>
            </ul>
        </nav>
        <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
</aside>