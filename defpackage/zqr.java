package defpackage;

import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zqr {
    public boolean b;
    private final zsk c;
    private final zsk d;
    private final Map e;
    private final HashSet f = new HashSet();
    final HashMap a = new HashMap();

    public zqr(zsq zsqVar, Map map) {
        map.getClass();
        this.e = amrz.j(map);
        this.c = zsqVar.f(new zso() { // from class: zqo
            @Override // defpackage.zfi
            public final void a(Object obj) {
                zqr.this.a((List) obj);
            }
        });
        this.d = zsqVar.d(new zsj() { // from class: zqn
            @Override // defpackage.zfi
            public final void a(Object obj) {
                zqr.this.b((String) obj);
            }
        });
    }

    private final void d(final File file, final View view) {
        if (view != null) {
            view.post(new Runnable() { // from class: zqq
                @Override // java.lang.Runnable
                public final void run() {
                    zqr zqrVar = zqr.this;
                    File file2 = file;
                    View view2 = view;
                    Drawable createFromPath = Drawable.createFromPath(file2.getPath());
                    if (createFromPath != null) {
                        view2.setBackground(createFromPath);
                        String valueOf = String.valueOf(file2.getPath());
                        String concat = valueOf.length() != 0 ? "StaticThumbnailProvider::drawStaticThumbnail: ".concat(valueOf) : new String("StaticThumbnailProvider::drawStaticThumbnail: ");
                        if (zqrVar.b) {
                            zga.c("PresetFilterDebug", concat);
                        }
                    }
                }
            });
        }
    }

    public final synchronized void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ztr ztrVar = (ztr) it.next();
            File file = (File) this.e.get(ztrVar.a);
            if (file == null) {
                return;
            }
            final TextureView textureView = ztrVar.b.a;
            textureView.post(new Runnable() { // from class: zqp
                @Override // java.lang.Runnable
                public final void run() {
                    textureView.setVisibility(4);
                }
            });
            View view = ztrVar.b.b;
            if (this.f.contains(file)) {
                d(file, view);
            } else {
                if (this.a.get(file) == null) {
                    this.a.put(file, new ArrayList());
                }
                ((List) this.a.get(file)).add(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(String str) {
        File file = new File(str);
        if (this.a.containsKey(file)) {
            Iterator it = ((List) this.a.get(file)).iterator();
            while (it.hasNext()) {
                d(file, (View) it.next());
            }
            this.a.remove(file);
        }
        this.f.add(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        this.c.a();
        this.d.a();
    }
}
