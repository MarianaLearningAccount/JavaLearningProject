package com.mariana.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage garajulLuiAndrei = new Garage("Lunca Nistrului");
        garajulLuiAndrei.carCapacity = 342;
        garajulLuiAndrei.hasComputerDiagnostics = true;
        garajulLuiAndrei.numberId = "5454";
        garajulLuiAndrei.scheduler = "uneori";

        System.out.println("Garajul lui Andrei are urmatoarele proprietati: Adresa " + garajulLuiAndrei.address +
                ", CarCapacity: " + garajulLuiAndrei.carCapacity + ", numberId: " + garajulLuiAndrei.numberId +
                ", Orarul de lucru: " + garajulLuiAndrei.scheduler + ", hasComputerDiagnostics: "
                + garajulLuiAndrei.hasComputerDiagnostics);

        Garage garajulLuiGheorghe = new Garage("Lunca Prutului");
        garajulLuiGheorghe.carCapacity = 545;
        garajulLuiGheorghe.hasComputerDiagnostics = false;
        garajulLuiGheorghe.numberId = "534254";
        garajulLuiGheorghe.scheduler = "mai des";

        System.out.println("Garajul lui Gheorghe are urmatoarele proprietati: Adresa " + garajulLuiGheorghe.address +
                ", CarCapacity: " + garajulLuiGheorghe.carCapacity + ", numberId: " + garajulLuiGheorghe.numberId +
                ", Orarul de lucru: " + garajulLuiGheorghe.scheduler + ", hasComputerDiagnostics: "
                + garajulLuiGheorghe.hasComputerDiagnostics);


        Garage garajulElenei = new Garage(345);
        garajulElenei.address = "Burebista 45";
        garajulElenei.hasComputerDiagnostics = false;
        garajulElenei.numberId = "534250";
        garajulElenei.scheduler = "mai des";

        System.out.println("Garajul Elenei are urmatoarele proprietati: Adresa " + garajulElenei.address +
                ", CarCapacity: " + garajulElenei.carCapacity + ", numberId: " + garajulElenei.numberId +
                ", Orarul de lucru: " + garajulElenei.scheduler + ", hasComputerDiagnostics: "
                + garajulElenei.hasComputerDiagnostics);

        Car masinaLuiIulian = new Car("Mercedes", "GLE Class", 2022, "Disel");
        masinaLuiIulian.carPrice = 45546;
        masinaLuiIulian.km = 1000000;
        masinaLuiIulian.gearType = "Automatic";

        System.out.println("Masina lui Iulian are urmatoarele proprietati: Make: " + masinaLuiIulian.make +
                ", Model: " + masinaLuiIulian.model + ", Production Year: " + masinaLuiIulian.productionYear +
                ", Fuel Type: " + masinaLuiIulian.fuelType + ", Car Price: "
                + masinaLuiIulian.carPrice + ", km: " + masinaLuiIulian.km + ", Gear Type: " + masinaLuiIulian.gearType);


        Tool elevatorTool = new Tool(23165465);
        elevatorTool.isElevator = true;
        elevatorTool.isUsed = true;
        elevatorTool.needsElectricity = true;

        System.out.println("Obiectul elevatorTool are urmatoarele proprietati: Cod Unic: " + elevatorTool.uniqueCode +
                ", este Elevator: " + elevatorTool.isElevator + ", foloseste electricitate: " + elevatorTool.needsElectricity +
                ", este utilizat: " + elevatorTool.isUsed);

        Worker lucratorulGavril = new Worker();
        lucratorulGavril.name = "Gavril";
        lucratorulGavril.age = 40;
        lucratorulGavril.isExperienced = true;
        lucratorulGavril.sexType = "Masculin";
        lucratorulGavril.specialization = "Electric Auto";

        System.out.println("Lucratorul Gavril are urmatoarele proprietati: Nume: " + lucratorulGavril.name +
                ", Varsta: " + lucratorulGavril.age + ", Experienta: " + lucratorulGavril.isExperienced +
                ", Specializarea: " + lucratorulGavril.specialization);

    }
}
