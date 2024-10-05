package defpackage;

import com.google.android.libraries.elements.interfaces.ControllerModuleLoader;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.JSModuleCache;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class snh extends JSEnvironment {
    private volatile JSController a;
    private volatile ControllerModuleLoader b;
    private final tbt c;
    private final boolean d;
    private final sng e;
    private final azrw f;
    private final Map g;

    public snh(boolean z, tbt tbtVar, sng sngVar, azrw azrwVar, Map map) {
        this.c = tbtVar;
        this.d = z;
        this.e = sngVar;
        this.f = azrwVar;
        this.g = map;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final JSController getController() {
        JSController jSController = this.a;
        if (jSController != null) {
            return jSController;
        }
        synchronized (this) {
            if (this.a == null) {
                sgf.D();
                tbf tbfVar = new tbf(this.d, this.c);
                sng sngVar = this.e;
                JSControllerConfig jSControllerConfig = new JSControllerConfig(sngVar.a, sngVar.b, sngVar.c, sngVar.d);
                JSController create = JSController.create(tbfVar.a, (JSModuleCache) this.f.get(), jSControllerConfig);
                if (create != null) {
                    for (sni sniVar : this.g.values()) {
                        create.registerFunctionBinding(sniVar.a().a(), sniVar);
                    }
                }
                this.a = create;
            }
        }
        return this.a;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final ControllerModuleLoader getModuleLoader() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = ((JSModuleCache) this.f.get()).getLoader();
            }
        }
        return this.b;
    }
}
