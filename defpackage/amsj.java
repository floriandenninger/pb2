package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amsj {
    public static amsj b;
    public final Map a;

    public amsj(Map map) {
        this.a = map;
    }

    public amsj(char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new HashMap();
    }

    public static amsj D(amsj amsjVar) {
        amsj amsjVar2 = new amsj((char[]) null, (char[]) null);
        if (amsjVar != null) {
            synchronized (amsjVar.a) {
                amsjVar2.a.putAll(amsjVar.a);
            }
        }
        return amsjVar2;
    }

    public static amsj E(amsj amsjVar) {
        if (amsjVar == null) {
            return null;
        }
        return D(amsjVar);
    }

    private static Drawable F(Resources resources, Drawable drawable, int i) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        int i2 = i == 0 ? intrinsicWidth : i;
        if (i == 0) {
            i = intrinsicHeight;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.draw(new Canvas(createBitmap));
        if (i2 != intrinsicWidth || i != intrinsicHeight) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, i2, i, true);
            createBitmap.recycle();
            createBitmap = createScaledBitmap;
        }
        int max = Math.max(2, resources.getInteger(R.integer.reel_player_right_cell_shadow));
        float integer = resources.getInteger(R.integer.reel_player_right_cell_shadow_dx);
        float integer2 = resources.getInteger(R.integer.reel_player_right_cell_shadow_dy);
        Bitmap createBitmap2 = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint(1);
        paint.setColor(((12 / (max / 2)) << 24) | 16777215);
        paint.setColorFilter(new LightingColorFilter(0, 0));
        while (max > 0) {
            float f = max;
            float f2 = integer - f;
            float f3 = integer2 - f;
            canvas.drawBitmap(createBitmap, f2, f3, paint);
            float f4 = integer2 + 0.0f;
            canvas.drawBitmap(createBitmap, f2, f4, paint);
            float f5 = integer2 + f;
            canvas.drawBitmap(createBitmap, f2, f5, paint);
            float f6 = 0.0f + integer;
            canvas.drawBitmap(createBitmap, f6, f3, paint);
            canvas.drawBitmap(createBitmap, f6, f5, paint);
            float f7 = f + integer;
            canvas.drawBitmap(createBitmap, f7, f3, paint);
            canvas.drawBitmap(createBitmap, f7, f4, paint);
            canvas.drawBitmap(createBitmap, f7, f5, paint);
            max -= 2;
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        createBitmap.recycle();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap2);
        bitmapDrawable.setBounds(0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
        return bitmapDrawable;
    }

    private static void G(View view, Drawable drawable) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(drawable);
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative.length == 4) {
                boolean z = false;
                for (int i = 0; i < compoundDrawablesRelative.length; i++) {
                    if (compoundDrawablesRelative[i] != null) {
                        compoundDrawablesRelative[i] = drawable;
                        z = true;
                    }
                }
                if (z) {
                    textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    return;
                }
                return;
            }
            return;
        }
        view.getContext();
    }

    private static String H(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("imageprefetch_");
        sb.append(str);
        return sb.toString();
    }

    public static String i(Class cls, Class cls2) {
        return String.format(Locale.ROOT, "(%s, %s)", cls.getSimpleName(), cls2.getSimpleName());
    }

    public static auzj j(aukf aukfVar) {
        aulq aulqVar = aukfVar.n;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
            return null;
        }
        aulq aulqVar2 = aukfVar.n;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        return (auzj) aulqVar2.pX(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
    }

    public static String k(auzj auzjVar) {
        if (auzjVar != null) {
            return auzjVar.f;
        }
        return null;
    }

    public static asni o(asni asniVar, asno asnoVar) {
        if (asnoVar == null) {
            return asniVar;
        }
        if ((asniVar.b & 2) != 0) {
            asno b2 = asno.b(asniVar.d);
            if (b2 == null) {
                b2 = asno.LIKE;
            }
            if (asnoVar.equals(b2)) {
                return asniVar;
            }
        }
        aong aongVar = (aong) asniVar.toBuilder();
        aongVar.copyOnWrite();
        asni asniVar2 = (asni) aongVar.instance;
        asniVar2.d = asnoVar.e;
        asniVar2.b |= 2;
        if (asnoVar == asno.LIKE) {
            int i = asniVar.b;
            if ((i & 16) != 0 && (i & 8) != 0) {
                aqyg aqygVar = asniVar.g;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                aongVar.copyOnWrite();
                asni asniVar3 = (asni) aongVar.instance;
                aqygVar.getClass();
                asniVar3.f = aqygVar;
                asniVar3.b |= 8;
                aqyg aqygVar2 = asniVar.f;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                aongVar.copyOnWrite();
                asni asniVar4 = (asni) aongVar.instance;
                aqygVar2.getClass();
                asniVar4.h = aqygVar2;
                asniVar4.b |= 32;
                aongVar.copyOnWrite();
                asni asniVar5 = (asni) aongVar.instance;
                asniVar5.g = null;
                asniVar5.b &= -17;
            }
            p(aongVar, asniVar);
        } else if (asnoVar == asno.INDIFFERENT) {
            q(aongVar, asniVar);
            p(aongVar, asniVar);
        } else if (asnoVar == asno.DISLIKE) {
            q(aongVar, asniVar);
            int i2 = asniVar.b;
            if ((i2 & 512) != 0 && (i2 & 256) != 0) {
                aqyg aqygVar3 = asniVar.k;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                aongVar.copyOnWrite();
                asni asniVar6 = (asni) aongVar.instance;
                aqygVar3.getClass();
                asniVar6.j = aqygVar3;
                asniVar6.b |= 256;
                aqyg aqygVar4 = asniVar.j;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
                aongVar.copyOnWrite();
                asni asniVar7 = (asni) aongVar.instance;
                aqygVar4.getClass();
                asniVar7.m = aqygVar4;
                asniVar7.b |= 1024;
                aongVar.copyOnWrite();
                asni asniVar8 = (asni) aongVar.instance;
                asniVar8.k = null;
                asniVar8.b &= -513;
            }
        }
        return (asni) aongVar.build();
    }

    public static void p(aong aongVar, asni asniVar) {
        int i = asniVar.b;
        if ((i & 1024) == 0 || (i & 256) == 0) {
            return;
        }
        aqyg aqygVar = asniVar.m;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        aongVar.copyOnWrite();
        asni asniVar2 = (asni) aongVar.instance;
        aqygVar.getClass();
        asniVar2.j = aqygVar;
        asniVar2.b |= 256;
        aqyg aqygVar2 = asniVar.j;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        aongVar.copyOnWrite();
        asni asniVar3 = (asni) aongVar.instance;
        aqygVar2.getClass();
        asniVar3.k = aqygVar2;
        asniVar3.b |= 512;
        aongVar.copyOnWrite();
        asni asniVar4 = (asni) aongVar.instance;
        asniVar4.m = null;
        asniVar4.b &= -1025;
    }

    public static void q(aong aongVar, asni asniVar) {
        int i = asniVar.b;
        if ((i & 32) == 0 || (i & 8) == 0) {
            return;
        }
        aqyg aqygVar = asniVar.h;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        aongVar.copyOnWrite();
        asni asniVar2 = (asni) aongVar.instance;
        aqygVar.getClass();
        asniVar2.f = aqygVar;
        asniVar2.b |= 8;
        aqyg aqygVar2 = asniVar.f;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        aongVar.copyOnWrite();
        asni asniVar3 = (asni) aongVar.instance;
        aqygVar2.getClass();
        asniVar3.g = aqygVar2;
        asniVar3.b |= 16;
        aongVar.copyOnWrite();
        asni asniVar4 = (asni) aongVar.instance;
        asniVar4.h = null;
        asniVar4.b &= -33;
    }

    public final void A() {
        this.a.clear();
    }

    public final void B(cqi cqiVar, csv csvVar) {
        Map map = this.a;
        if (csvVar.equals(map.get(cqiVar))) {
            map.remove(cqiVar);
        }
    }

    public final boolean C(Class cls) {
        return this.a.containsKey(cls);
    }

    public Collection a() {
        return new ArrayList();
    }

    public final void b(Object obj, Iterable iterable) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection != null) {
            for (Object obj2 : iterable) {
                amkq.r(obj, obj2);
                collection.add(obj2);
            }
            return;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Collection a = a();
            while (it.hasNext()) {
                Object next = it.next();
                amkq.r(obj, next);
                a.add(next);
            }
            this.a.put(obj, a);
        }
    }

    public final amrv c() {
        return amrv.c(this.a.entrySet());
    }

    public final void d(Object obj, Object obj2) {
        amkq.r(obj, obj2);
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            Map map = this.a;
            Collection a = a();
            map.put(obj, a);
            collection = a;
        }
        collection.add(obj2);
    }

    public final void e(Object obj, Object... objArr) {
        b(obj, Arrays.asList(objArr));
    }

    public final Map f(Collection collection) {
        Set unmodifiableSet;
        HashMap hashMap = new HashMap();
        for (String str : this.a.keySet()) {
            if (!this.a.containsKey(str)) {
                unmodifiableSet = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) this.a.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(hashSet);
            }
            hashMap.put(str, unmodifiableSet);
        }
        return hashMap;
    }

    public final void g(Object obj) {
        if (h(obj)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        throw new IllegalArgumentException(arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", obj.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", obj.getClass().getCanonicalName(), arrayList));
    }

    public final boolean h(Object obj) {
        azrw azrwVar = (azrw) this.a.get(obj.getClass().getName());
        if (azrwVar == null) {
            return false;
        }
        axph axphVar = (axph) azrwVar.get();
        try {
            amsj a = axphVar.a();
            axphVar.getClass();
            a.getClass();
            a.g(obj);
            return true;
        } catch (ClassCastException e) {
            throw new axpi(String.format("%s does not implement AndroidInjector.Factory<%s>", axphVar.getClass().getCanonicalName(), obj.getClass().getCanonicalName()), e);
        }
    }

    public final void l(View view, int i, int i2) {
        Resources resources;
        Drawable drawable;
        if (view == null || (drawable = (resources = view.getContext().getResources()).getDrawable(i2)) == null) {
            return;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        String format = String.format(Locale.US, "%d.%d", Integer.valueOf(dimensionPixelSize), Integer.valueOf(i2));
        Drawable drawable2 = (Drawable) this.a.get(format);
        if (drawable2 == null) {
            drawable2 = F(resources, drawable, dimensionPixelSize);
            this.a.put(format, drawable2);
        }
        G(view, drawable2);
    }

    public final void m(View view, int i, int i2) {
        if (view == null) {
            return;
        }
        Resources resources = view.getContext().getResources();
        Drawable drawable = resources.getDrawable(i);
        Drawable drawable2 = resources.getDrawable(i2);
        if (drawable == null || drawable2 == null) {
            return;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.reel_player_right_large_icon_size);
        Locale locale = Locale.US;
        Integer valueOf = Integer.valueOf(dimensionPixelSize);
        String format = String.format(locale, "%d.%d", valueOf, Integer.valueOf(i2));
        String format2 = String.format(Locale.US, "%d.%d", valueOf, Integer.valueOf(i));
        Drawable drawable3 = (Drawable) this.a.get(format);
        if (drawable3 == null) {
            drawable3 = F(resources, drawable2, dimensionPixelSize);
            this.a.put(format, drawable3);
        }
        Drawable drawable4 = (Drawable) this.a.get(format2);
        if (drawable4 == null) {
            drawable4 = F(resources, drawable, dimensionPixelSize);
            this.a.put(format2, drawable4);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, drawable3);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable4);
        stateListDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        G(view, stateListDrawable);
    }

    public final asni n(asni asniVar) {
        if (asniVar == null || (asniVar.b & 1) == 0) {
            return asniVar;
        }
        asnp asnpVar = asniVar.c;
        if (asnpVar == null) {
            asnpVar = asnp.a;
        }
        if ((asnpVar.b & 1) == 0) {
            return asniVar;
        }
        return o(asniVar, (asno) this.a.get(asnpVar.c));
    }

    public final AtomicReference r(String str) {
        synchronized (this) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.a.get(str);
    }

    public final void s(String str, Callable callable) {
        this.a.put(str, callable);
    }

    public final boolean t(dha dhaVar) {
        String H = H(dhaVar.m);
        return this.a.containsKey(H) && ((Integer) this.a.get(H)).intValue() == 1;
    }

    public final void u(dha dhaVar, int i) {
        this.a.put(H(dhaVar.m), Integer.valueOf(i));
    }

    public final Object v(Class cls) {
        return this.a.get(cls);
    }

    public final void w(Class cls, Object obj) {
        this.a.put(cls, obj);
    }

    public final synchronized void x(dhe dheVar, dji djiVar, String str) {
        if (str == null) {
            return;
        }
        diz dizVar = (diz) this.a.get(str);
        if (dizVar == null) {
            return;
        }
        dizVar.b = true;
        int c = dizVar.a.c();
        for (int i = 0; i < c; i++) {
            diy diyVar = (diy) dizVar.a.g(i);
            diyVar.a = djiVar;
            Object[] objArr = diyVar.c;
            if (objArr != null) {
                objArr[0] = dheVar;
            }
        }
    }

    public final synchronized void y() {
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            diz dizVar = (diz) this.a.get(it.next());
            if (dizVar != null && dizVar.b) {
                dizVar.b = false;
            }
            it.remove();
        }
    }

    public final synchronized void z(String str, diy diyVar) {
        if (str == null) {
            return;
        }
        diz dizVar = (diz) this.a.get(str);
        if (dizVar == null) {
            dizVar = new diz();
            this.a.put(str, dizVar);
        }
        dizVar.a.k(diyVar.b, diyVar);
    }

    public amsj(amsj amsjVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = Collections.unmodifiableMap(new HashMap(amsjVar.a));
    }

    public amsj(byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3) {
        this.a = new HashMap();
        new HashMap();
    }

    public amsj(short[] sArr, byte[] bArr) {
        this.a = new HashMap();
    }

    public amsj(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new HashMap();
    }

    public amsj(char[] cArr, char[] cArr2) {
        this.a = DesugarCollections.synchronizedMap(new HashMap());
    }

    public amsj(byte[] bArr, short[] sArr) {
        this.a = new HashMap();
    }

    public amsj(short[] sArr) {
        this.a = new HashMap();
    }

    public amsj(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new HashMap();
    }

    public amsj(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = DesugarCollections.synchronizedMap(new HashMap());
    }

    public amsj(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = new HashMap();
    }

    public amsj(char[] cArr, byte[] bArr) {
        this.a = new ConcurrentHashMap();
    }

    public amsj(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new HashMap();
    }

    public amsj(byte[] bArr, char[] cArr) {
        this.a = new HashMap();
    }

    public amsj(char[] cArr) {
        this.a = new HashMap();
    }

    public amsj(byte[] bArr, byte[] bArr2) {
        this.a = new WeakHashMap();
    }

    public amsj(byte[] bArr) {
        this.a = new HashMap();
    }

    public amsj() {
        this.a = ampx.e();
    }

    public amsj(Map map, Map map2) {
        if (!map.isEmpty()) {
            LinkedHashMap o = ayaw.o(((amvo) map).d + ((amvo) map2).d);
            o.putAll(map2);
            for (Map.Entry entry : ((amrz) map).entrySet()) {
                o.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map2 = Collections.unmodifiableMap(o);
        }
        this.a = map2;
    }
}
