<?php
/**
 * Here is your custom functions.
 */

use support\Response;

if (!function_exists('ajax_result')) {
    function ajax_result(int $code = 200, string $msg = 'success', mixed $data = null): Response
    {
        $result = [];
        $result['code'] = $code;
        $result['msg'] = $msg;
        if (!empty($data)) {
            $result['data'] = $data;
        }
        return json($result);
    }
}
