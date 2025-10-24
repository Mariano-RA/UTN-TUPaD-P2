package tp5_marianorodriguezarce.Actividad_1.Ejercicio_5;

public class Computadora {
        private String marca;
        private String numeroSerie;
        private PlacaMadre placaMadre; // composición
        private Propietario propietario; // bidireccional

        public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
            if (placaMadre == null) throw new IllegalArgumentException("PlacaMadre no puede ser null (composición).");
            this.marca = marca;
            this.numeroSerie = numeroSerie;
            this.placaMadre = placaMadre;
        }
        public String getMarca() { return marca; }
        public void setMarca(String marca) { this.marca = marca; }
        public String getNumeroSerie() { return numeroSerie; }
        public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
        public PlacaMadre getPlacaMadre() { return placaMadre; }
        public void setPlacaMadre(PlacaMadre placaMadre) {
            if (placaMadre == null) throw new IllegalArgumentException("PlacaMadre no puede ser null (composición).");
            this.placaMadre = placaMadre;
        }

        public Propietario getPropietario() { return propietario; }
        void setPropietarioInternal(Propietario p) { this.propietario = p; }
        public void setPropietario(Propietario p) {
            if (this.propietario == p) return;
            if (this.propietario != null) {
                Propietario old = this.propietario;
                this.propietario = null;
                old.setComputadoraInternal(null);
            }
            this.propietario = p;
            if (p != null) {
                p.setComputadoraInternal(this);
            }
        }
    }