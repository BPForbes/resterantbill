package com.example.javafxlab;

public enum Service {
    POOR {
        @Override
        public double tip() {
            return 0.1;
        }

        @Override
        public String toString() {
            return "Poor";
        }
    },
    GOOD {
        @Override
        public double tip() {
            return 0.15;
        }

        @Override
        public String toString() {
            return "Good";
        }
    };

    // Should add more classes of tip above

    abstract public double tip();

    public double computeTotal(double bill) {
        return bill * (1.0 + tip());
    }
}
