abstract class Patient {
    int patientId;
    String name;

    abstract double calculateBill();
}

class InPatient extends Patient {
    double days = 5;
    double rate = 2000;

    double calculateBill() {
        return days * rate;
    }
}

class OutPatient extends Patient {
    double consultation = 500;

    double calculateBill() {
        return consultation;
    }
}