package defpackage;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnv implements ComponentCallbacks2 {
    private static volatile cnv h;
    private static volatile boolean i;
    public final ctm a;
    public final cod b;
    public final col c;
    public final ctk d;
    public final daw e;
    public final List f = new ArrayList();
    public final did g;
    private final cuk j;

    public cnv(Context context, csr csrVar, cuk cukVar, ctm ctmVar, ctk ctkVar, daw dawVar, did didVar, cnu cnuVar, Map map, List list, amsj amsjVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        cqp cykVar;
        cqp cyqVar;
        this.a = ctmVar;
        this.d = ctkVar;
        this.j = cukVar;
        this.e = dawVar;
        this.g = didVar;
        Resources resources = context.getResources();
        if (((coa) ((coe) amsjVar.a.get(coa.class))) != null) {
            cyd.c = 0;
        }
        col colVar = new col();
        this.c = colVar;
        colVar.k(new cxp());
        if (Build.VERSION.SDK_INT >= 27) {
            colVar.k(new cyb());
        }
        List b = colVar.b();
        czi cziVar = new czi(context, b, ctmVar, ctkVar);
        cyz cyzVar = new cyz(ctmVar, new cyw(2));
        cxx cxxVar = new cxx(colVar.b(), resources.getDisplayMetrics(), ctmVar, ctkVar);
        if (!amsjVar.C(cny.class) || Build.VERSION.SDK_INT < 28) {
            cykVar = new cyk(cxxVar, 1);
            cyqVar = new cyq(cxxVar, ctkVar);
        } else {
            cyqVar = new cyi(0);
            cykVar = new cyi(1, null);
        }
        czg czgVar = new czg(context);
        cwh cwhVar = new cwh(resources, 2);
        cwh cwhVar2 = new cwh(resources, 3);
        cwh cwhVar3 = new cwh(resources, 0);
        cwh cwhVar4 = new cwh(resources, 1);
        cxf cxfVar = new cxf(ctkVar);
        czw czwVar = new czw();
        dab dabVar = new dab(1);
        ContentResolver contentResolver = context.getContentResolver();
        colVar.d(ByteBuffer.class, new cve());
        colVar.d(InputStream.class, new cwj(ctkVar));
        colVar.h("Bitmap", ByteBuffer.class, Bitmap.class, cykVar);
        colVar.h("Bitmap", InputStream.class, Bitmap.class, cyqVar);
        colVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new cyk(cxxVar, 0));
        colVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, cyzVar);
        colVar.h("Bitmap", AssetFileDescriptor.class, Bitmap.class, new cyz(ctmVar, new cyw(1)));
        colVar.g(Bitmap.class, Bitmap.class, cwo.a);
        colVar.h("Bitmap", Bitmap.class, Bitmap.class, new czh(1));
        colVar.e(Bitmap.class, cxfVar);
        colVar.h("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new cxd(resources, cykVar));
        colVar.h("BitmapDrawable", InputStream.class, BitmapDrawable.class, new cxd(resources, cyqVar));
        colVar.h("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new cxd(resources, cyzVar));
        colVar.e(BitmapDrawable.class, new cxe(ctmVar, cxfVar));
        colVar.h("Gif", InputStream.class, czl.class, new czv(b, cziVar, ctkVar));
        colVar.h("Gif", ByteBuffer.class, czl.class, cziVar);
        colVar.e(czl.class, new czm());
        colVar.g(cpc.class, cpc.class, cwo.a);
        colVar.h("Bitmap", cpc.class, Bitmap.class, new czt(ctmVar));
        colVar.f(Uri.class, Drawable.class, czgVar);
        colVar.f(Uri.class, Bitmap.class, new cyn(czgVar, ctmVar));
        colVar.l(new cza());
        colVar.g(File.class, ByteBuffer.class, new cvc(2));
        colVar.g(File.class, InputStream.class, new cvj(new cvm(0)));
        colVar.f(File.class, File.class, new czh(2));
        colVar.g(File.class, ParcelFileDescriptor.class, new cvj(new cvm(1)));
        colVar.g(File.class, File.class, cwo.a);
        colVar.l(new crg(ctkVar));
        colVar.l(new crj());
        colVar.g(Integer.TYPE, InputStream.class, cwhVar);
        colVar.g(Integer.TYPE, ParcelFileDescriptor.class, cwhVar3);
        colVar.g(Integer.class, InputStream.class, cwhVar);
        colVar.g(Integer.class, ParcelFileDescriptor.class, cwhVar3);
        colVar.g(Integer.class, Uri.class, cwhVar2);
        colVar.g(Integer.TYPE, AssetFileDescriptor.class, cwhVar4);
        colVar.g(Integer.class, AssetFileDescriptor.class, cwhVar4);
        colVar.g(Integer.TYPE, Uri.class, cwhVar2);
        colVar.g(String.class, InputStream.class, new cvi());
        colVar.g(Uri.class, InputStream.class, new cvi());
        colVar.g(String.class, InputStream.class, new cvc(5));
        colVar.g(String.class, ParcelFileDescriptor.class, new cvc(4));
        colVar.g(String.class, AssetFileDescriptor.class, new cvc(3));
        colVar.g(Uri.class, InputStream.class, new cux(context.getAssets(), 0));
        colVar.g(Uri.class, ParcelFileDescriptor.class, new cux(context.getAssets(), 1));
        colVar.g(Uri.class, InputStream.class, new cws(context, 0));
        colVar.g(Uri.class, InputStream.class, new cws(context, 2));
        if (Build.VERSION.SDK_INT >= 29) {
            colVar.g(Uri.class, InputStream.class, new cwu(context, InputStream.class));
            colVar.g(Uri.class, ParcelFileDescriptor.class, new cwu(context, ParcelFileDescriptor.class));
        }
        colVar.g(Uri.class, InputStream.class, new cwl(contentResolver, 2));
        colVar.g(Uri.class, ParcelFileDescriptor.class, new cwl(contentResolver, 0));
        colVar.g(Uri.class, AssetFileDescriptor.class, new cwl(contentResolver, 1));
        colVar.g(Uri.class, InputStream.class, new cwo(0));
        colVar.g(URL.class, InputStream.class, new cwo(2));
        colVar.g(Uri.class, File.class, new cws(context, 1));
        colVar.g(cvo.class, InputStream.class, new cwq());
        colVar.g(byte[].class, ByteBuffer.class, new cvc(1));
        colVar.g(byte[].class, InputStream.class, new cvc(0));
        colVar.g(Uri.class, Uri.class, cwo.a);
        colVar.g(Drawable.class, Drawable.class, cwo.a);
        colVar.f(Drawable.class, Drawable.class, new czh(0));
        colVar.m(Bitmap.class, BitmapDrawable.class, new czx(resources));
        colVar.m(Bitmap.class, byte[].class, czwVar);
        colVar.m(Drawable.class, byte[].class, new czy(ctmVar, czwVar, dabVar));
        colVar.m(czl.class, byte[].class, dabVar);
        if (Build.VERSION.SDK_INT >= 23) {
            cyz cyzVar2 = new cyz(ctmVar, new cyw(0));
            colVar.f(ByteBuffer.class, Bitmap.class, cyzVar2);
            colVar.f(ByteBuffer.class, BitmapDrawable.class, new cxd(resources, cyzVar2));
        }
        this.b = new cod(context, ctkVar, colVar, cnuVar, map, list, csrVar, amsjVar, null, null, null, null);
    }

    public static cnv b(Context context) {
        if (h == null) {
            GeneratedAppGlideModule e = e(context.getApplicationContext());
            synchronized (cnv.class) {
                if (h == null) {
                    if (!i) {
                        i = true;
                        f(context, new coc(), e);
                        i = false;
                    } else {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                }
            }
        }
        return h;
    }

    public static cor c(Context context) {
        did.at(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).e.a(context);
    }

    private static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e) {
            g(e);
            return null;
        } catch (InstantiationException e2) {
            g(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            g(e3);
            return null;
        } catch (InvocationTargetException e4) {
            g(e4);
            return null;
        }
    }

    private static void f(Context context, coc cocVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context context2;
        Context applicationContext = context.getApplicationContext();
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.e()) {
            emptyList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            emptyList.add(dwy.b(str));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
            }
        }
        List<dbg> list = emptyList;
        if (generatedAppGlideModule != null && !generatedAppGlideModule.b().isEmpty()) {
            Set b = generatedAppGlideModule.b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (b.contains(((dbg) it.next()).getClass())) {
                    it.remove();
                }
            }
        }
        cocVar.i = generatedAppGlideModule != null ? generatedAppGlideModule.a() : null;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((dbg) it2.next()).c(applicationContext, cocVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.c(applicationContext, cocVar);
        }
        if (cocVar.e == null) {
            cocVar.e = cuv.b().a();
        }
        if (cocVar.f == null) {
            cuq cuqVar = new cuq(true);
            cuqVar.b(1);
            cuqVar.a = "disk-cache";
            cocVar.f = cuqVar.a();
        }
        if (cocVar.j == null) {
            int i2 = cuv.a() >= 4 ? 2 : 1;
            cuq cuqVar2 = new cuq(true);
            cuqVar2.b(i2);
            cuqVar2.a = "animation";
            cocVar.j = cuqVar2.a();
        }
        if (cocVar.n == null) {
            cocVar.n = new cul(applicationContext).c();
        }
        if (cocVar.o == null) {
            cocVar.o = new did();
        }
        if (cocVar.c == null) {
            int i3 = cocVar.n.b;
            if (i3 > 0) {
                cocVar.c = new ctu(i3);
            } else {
                cocVar.c = new ctn();
            }
        }
        if (cocVar.d == null) {
            cocVar.d = new ctt(cocVar.n.a);
        }
        if (cocVar.m == null) {
            cocVar.m = new cuk(cocVar.n.c);
        }
        if (cocVar.g == null) {
            cocVar.g = new cuh(applicationContext);
        }
        if (cocVar.b == null) {
            cuk cukVar = cocVar.m;
            cub cubVar = cocVar.g;
            cuv cuvVar = cocVar.f;
            cuv cuvVar2 = cocVar.e;
            context2 = applicationContext;
            new cuv(new ThreadPoolExecutor(0, Integer.MAX_VALUE, cuv.a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new cuu(new cus(0), "source-unlimited", false)));
            cocVar.b = new csr(cukVar, cubVar, cuvVar, cuvVar2, cocVar.j, cocVar.k);
        } else {
            context2 = applicationContext;
        }
        List list2 = cocVar.l;
        if (list2 == null) {
            cocVar.l = Collections.emptyList();
        } else {
            cocVar.l = Collections.unmodifiableList(list2);
        }
        amsj amsjVar = new amsj(cocVar.p, null, null, null, null, null);
        Context context3 = context2;
        cnv cnvVar = new cnv(context3, cocVar.b, cocVar.m, cocVar.c, cocVar.d, new daw(cocVar.i, amsjVar, null, null, null, null), cocVar.o, cocVar.h, cocVar.a, cocVar.l, amsjVar, null, null, null, null, null);
        for (dbg dbgVar : list) {
            try {
                dbgVar.d(context3, cnvVar, cnvVar.c);
            } catch (AbstractMethodError e2) {
                String valueOf = String.valueOf(dbgVar.getClass().getName());
                throw new IllegalStateException(valueOf.length() != 0 ? "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(valueOf) : new String("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: "), e2);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.d(context3, cnvVar, cnvVar.c);
        }
        context3.registerComponentCallbacks(cnvVar);
        h = cnvVar;
    }

    private static void g(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.b.getBaseContext();
    }

    public final void d() {
        ddn.j();
        this.j.i();
        this.a.c();
        this.d.b();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        d();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        ddn.j();
        synchronized (this.f) {
            for (cor corVar : this.f) {
            }
        }
        cuk cukVar = this.j;
        if (i2 >= 40) {
            cukVar.i();
        } else {
            if (i2 < 20) {
                if (i2 == 15) {
                    i2 = 15;
                }
            }
            cukVar.j(cukVar.e() / 2);
        }
        this.a.e(i2);
        this.d.d(i2);
    }
}
