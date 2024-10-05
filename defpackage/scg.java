package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class scg {
    public static final String a;
    private static final amxj b = amxj.l("com/google/android/libraries/ar/faceviewer/components/lifecycle/NativeLibManager");
    private static final String c;
    private static boolean d;

    static {
        String str = Build.SUPPORTED_ABIS[0];
        c = str;
        a = String.format("assets/%s/libfaceviewer_jni.so", str);
        d = false;
    }

    private scg() {
    }

    public static boolean a(String str) {
        try {
            ancd.a(str);
            d = true;
            ((amxh) ((amxh) b.e()).i("com/google/android/libraries/ar/faceviewer/components/lifecycle/NativeLibManager", "tryLoadingJNILib", 51, "NativeLibManager.java")).q("Native Library loaded.");
            return true;
        } catch (SecurityException | UnsatisfiedLinkError e) {
            ((amxh) ((amxh) ((amxh) b.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/components/lifecycle/NativeLibManager", "tryLoadingJNILib", '6', "NativeLibManager.java")).q("Error loading native library.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized anhy b(final Context context, Executor executor) {
        synchronized (scg.class) {
            if (d) {
                return anaf.O(true);
            }
            return anaf.T(new anfy() { // from class: scf
                @Override // defpackage.anfy
                public final anhy a() {
                    Context context2 = context;
                    if (!scg.a("drishti_jni_native")) {
                        final alqo alqoVar = (alqo) ((alqd) alkd.u(context2)).a.get();
                        if (alqoVar.b().contains("faceviewer_split")) {
                            return anaf.O(Boolean.valueOf(scg.a(scg.a)));
                        }
                        return aci.c(new aeu() { // from class: scc
                            @Override // defpackage.aeu
                            public final Object a(final aes aesVar) {
                                alqo alqoVar2 = alqo.this;
                                alqu alquVar = new alqu();
                                alquVar.a.add("faceviewer_split");
                                alsc a2 = alqoVar2.a(new alqv(alquVar));
                                a2.e(new alsa() { // from class: sce
                                    @Override // defpackage.alsa
                                    public final void a(Object obj) {
                                        aes.this.c(Boolean.valueOf(scg.a(scg.a)));
                                    }
                                });
                                a2.d(new alrx() { // from class: scd
                                    @Override // defpackage.alrx
                                    public final void a(Exception exc) {
                                        aes aesVar2 = aes.this;
                                        String str = scg.a;
                                        aesVar2.d(exc);
                                    }
                                });
                                return "NativeLibManager.loadSlpitLib";
                            }
                        });
                    }
                    return anaf.O(true);
                }
            }, executor);
        }
    }
}
