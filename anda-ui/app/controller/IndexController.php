<?php

namespace app\controller;

use support\Request;
use support\Response;

class IndexController
{
    public function index(Request $request): Response
    {
        return view('index');
    }

}
