<?php
/**
 * This file is part of webman.
 *
 * Licensed under The MIT License
 * For full copyright and license information, please see the MIT-LICENSE.txt
 * Redistributions of files must retain the above copyright notice.
 *
 * @author    walkor<walkor@workerman.net>
 * @copyright walkor<walkor@workerman.net>
 * @link      http://www.workerman.net/
 * @license   http://www.opensource.org/licenses/mit-license.php MIT License
 */


use support\Request;
use Webman\Route;

Route::any('/', [app\controller\IndexController::class, 'index']);

// 加载默认路由配置
require_once app_path('config/route.php');

// 加载admin应用下的路由配置
Route::group('/admin', function () {
    require_once app_path('admin/config/route.php');
});

// 加载api应用下的路由配置
Route::group('/api', function () {
    require_once app_path('api/config/route.php');
});

// 错误路由
Route::fallback(function (Request $request) {
    // ajax请求时返回json
    if ($request->expectsJson()) {
        // return json(['code' => 404, 'msg' => '404 not found']);
        return ajax_result(404, '404 not found');
    }
    // 页面请求返回404.html模版
    return view('404')->withStatus(404);
});

// 禁止默认路由
Route::disableDefaultRoute();
