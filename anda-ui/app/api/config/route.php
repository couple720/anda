<?php

use Webman\Route;

Route::any('', [app\api\controller\IndexController::class, 'index']);
Route::any('/', [app\api\controller\IndexController::class, 'index']);
Route::any('/index', [app\api\controller\IndexController::class, 'index']);
