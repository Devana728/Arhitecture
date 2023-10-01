package ModelElements;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, Poligon poligon, Camera camera) throws Exception {
        this.id = id;
        
        this.models = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        models.add (poligon);
        cameras.add (camera);

        
    }
    
    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T model, E flash) {
        return model;
    }
}