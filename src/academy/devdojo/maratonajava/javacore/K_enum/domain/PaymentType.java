package academy.devdojo.maratonajava.javacore.K_enum.domain;

public enum PaymentType {
        DEBIT{
            @Override
            public double discount(int value) {
                return value * 0.1;
            }
        }, CREDIT{
            @Override
            public double discount(int value) {
                return value * 0.05;
        }
    };

        public abstract double discount(int value);
}