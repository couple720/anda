<?php

use Webman\Route;

Route::any('/index', [app\controller\IndexController::class, 'index']);
