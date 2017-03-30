package ADO_05;

class Zoologico {

    Zoologico(int jaulas) {

        Jaula[] jaula = new Jaula[jaulas];
        for(int i = 0; i < jaulas; i++) {
            jaula[i] = new Jaula();
        }

        Cachorro cachorro = new Cachorro();
        Elefante elefante = new Elefante();
        Gato gato = new Gato();
        Girafa girafa = new Girafa();
        Hiena hiena = new Hiena();
        Jacare jacare = new Jacare();
        Leao leao = new Leao();
        Macaco macaco = new Macaco();
        Ovelha ovelha = new Ovelha();
        Urso urso = new Urso();

        jaula[0].setAnimal(cachorro);
        jaula[1].setAnimal(elefante);
        jaula[2].setAnimal(gato);
        jaula[3].setAnimal(girafa);
        jaula[4].setAnimal(hiena);
        jaula[5].setAnimal(jacare);
        jaula[6].setAnimal(leao);
        jaula[7].setAnimal(macaco);
        jaula[8].setAnimal(ovelha);
        jaula[9].setAnimal(urso);

        for(int i = 0; i < jaulas; i++) {
            jaula[i].getAnimal().movimentar();
            jaula[i].getAnimal().som();
        }

    }

}
