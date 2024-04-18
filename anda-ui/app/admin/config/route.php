<?php

use Webman\Route;

Route::any('', [app\admin\controller\IndexController::class, 'index']);
Route::any('/', [app\admin\controller\IndexController::class, 'index']);
Route::any('/index', [app\admin\controller\IndexController::class, 'index']);
