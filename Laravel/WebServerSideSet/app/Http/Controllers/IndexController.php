<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class IndexController extends Controller
{
    public function home() {

        $welcome = 'Hello turma SD';
        $name = 'Rui';
        $cesaeInfo = $this->getCourseInfo();
        $contactInfo = $this->getContactInfo();
        $cesaeInfos = $this->getCesaeInfos();

        //dd($contactInfo);

        return view('general.home', compact('welcome', 'name', 'cesaeInfo', 'contactInfo', 'cesaeInfos'));
    }


    protected function getCourseInfo() {
         $info = ['Laravel', 'Angular', 'Sql'];
         return $info;
    }

    protected function getContactInfo() {
        return $contactInfo = [
            ['id' => 1, 'name' => 'Rui','phone' => 919999999],
            ['id' => 2, 'name' => 'Rita','phone' => 918888888],
            ['id' => 3, 'name' => 'David','phone' => 917777777]
        ];
    }

    private function getCesaeInfos() {
        return $cesaeInfos = [
            'name' => 'Cesae',
            'address' => 'Rua Ciríaco Cardoso 186, 4150-212 Porto',
            'email' => 'cesae@cesae.pt'
        ];
    }
}
