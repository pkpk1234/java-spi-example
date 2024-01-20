import sample.plugin0.impl.ChartPlugin;

module sample.plugin0 {
    requires sample.api;
    requires javafx.graphics;
    provides sample.plugin.Plugin with ChartPlugin;
}