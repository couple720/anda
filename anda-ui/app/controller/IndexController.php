<?php

namespace app\controller;

use support\Request;

class IndexController
{
    public function index(Request $request): string
    {
        return 'hello world';
    }

}
