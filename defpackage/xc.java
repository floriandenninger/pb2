package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xc {
    private static xc b;
    private WeakHashMap c;
    private aeg d;
    private aeh e;
    private final WeakHashMap f = new WeakHashMap(0);
    private TypedValue g;
    private boolean h;
    private xb i;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final aef j = new aef(6);

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        synchronized (xc.class) {
            aef aefVar = j;
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) aefVar.c(Integer.valueOf(aef.g(i, mode)));
            if (porterDuffColorFilter != null) {
                return porterDuffColorFilter;
            }
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
            return porterDuffColorFilter2;
        }
    }

    public static synchronized xc e() {
        xc xcVar;
        synchronized (xc.class) {
            if (b == null) {
                xc xcVar2 = new xc();
                b = xcVar2;
                if (Build.VERSION.SDK_INT < 24) {
                    xcVar2.k("vector", new wy(2));
                    xcVar2.k("animated-vector", new wy(0));
                    xcVar2.k("animated-selector", new wy(1));
                    xcVar2.k("drawable", new wz());
                }
            }
            xcVar = b;
        }
        return xcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(android.graphics.drawable.Drawable r3, defpackage.yi r4, int[] r5) {
        /*
            boolean r0 = defpackage.ud.d(r3)
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r3.mutate()
            if (r0 != r3) goto Ld
            goto Le
        Ld:
            return
        Le:
            boolean r0 = r4.d
            r1 = 0
            if (r0 != 0) goto L1d
            boolean r0 = r4.c
            if (r0 == 0) goto L19
            r0 = r1
            goto L1f
        L19:
            r3.clearColorFilter()
            goto L39
        L1d:
            android.content.res.ColorStateList r0 = r4.a
        L1f:
            boolean r2 = r4.c
            if (r2 == 0) goto L26
            android.graphics.PorterDuff$Mode r4 = r4.b
            goto L28
        L26:
            android.graphics.PorterDuff$Mode r4 = defpackage.xc.a
        L28:
            if (r0 == 0) goto L36
            if (r4 != 0) goto L2d
            goto L36
        L2d:
            r1 = 0
            int r5 = r0.getColorForState(r5, r1)
            android.graphics.PorterDuffColorFilter r1 = b(r5, r4)
        L36:
            r3.setColorFilter(r1)
        L39:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 > r5) goto L42
            r3.invalidateSelf()
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc.h(android.graphics.drawable.Drawable, yi, int[]):void");
    }

    private static long i(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private final synchronized Drawable j(Context context, long j2) {
        aee aeeVar = (aee) this.f.get(context);
        if (aeeVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) aeeVar.f(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            aeeVar.l(j2);
        }
        return null;
    }

    private final void k(String str, xa xaVar) {
        if (this.d == null) {
            this.d = new aeg();
        }
        this.d.put(str, xaVar);
    }

    private final synchronized void l(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            aee aeeVar = (aee) this.f.get(context);
            if (aeeVar == null) {
                aeeVar = new aee();
                this.f.put(context, aeeVar);
            }
            aeeVar.k(j2, new WeakReference(constantState));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ColorStateList a(Context context, int i) {
        int b2;
        aeh aehVar;
        WeakHashMap weakHashMap = this.c;
        ColorStateList colorStateList = null;
        ColorStateList colorStateList2 = (weakHashMap == null || (aehVar = (aeh) weakHashMap.get(context)) == null) ? null : (ColorStateList) aehVar.e(i);
        if (colorStateList2 == null) {
            xb xbVar = this.i;
            if (xbVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateList = nz.a(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateList = nz.a(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3];
                    int[] iArr2 = new int[3];
                    ColorStateList c = yf.c(context, R.attr.colorSwitchThumbNormal);
                    if (c == null || !c.isStateful()) {
                        iArr[0] = yf.a;
                        iArr2[0] = yf.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = yf.d;
                        iArr2[1] = yf.b(context, R.attr.colorControlActivated);
                        iArr[2] = yf.e;
                        iArr2[2] = yf.b(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = yf.a;
                        iArr[0] = iArr3;
                        iArr2[0] = c.getColorForState(iArr3, 0);
                        iArr[1] = yf.d;
                        iArr2[1] = yf.b(context, R.attr.colorControlActivated);
                        iArr[2] = yf.e;
                        iArr2[2] = c.getDefaultColor();
                    }
                    colorStateList = new ColorStateList(iArr, iArr2);
                } else {
                    if (i == R.drawable.abc_btn_default_mtrl_shape) {
                        b2 = yf.b(context, R.attr.colorButtonNormal);
                    } else if (i == R.drawable.abc_btn_borderless_material) {
                        colorStateList = sn.b(context, 0);
                    } else if (i == R.drawable.abc_btn_colored_material) {
                        b2 = yf.b(context, R.attr.colorAccent);
                    } else {
                        if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                            if (sn.a(((sn) xbVar).b, i)) {
                                colorStateList = yf.c(context, R.attr.colorControlNormal);
                            } else if (sn.a(((sn) xbVar).e, i)) {
                                colorStateList = nz.a(context, R.color.abc_tint_default);
                            } else if (sn.a(((sn) xbVar).f, i)) {
                                colorStateList = nz.a(context, R.color.abc_tint_btn_checkable);
                            } else if (i == R.drawable.abc_seekbar_thumb_material) {
                                colorStateList = nz.a(context, R.color.abc_tint_seek_thumb);
                                i = R.drawable.abc_seekbar_thumb_material;
                            }
                        }
                        colorStateList = nz.a(context, R.color.abc_tint_spinner);
                    }
                    colorStateList = sn.b(context, b2);
                }
            }
            if (colorStateList != null) {
                if (this.c == null) {
                    this.c = new WeakHashMap();
                }
                aeh aehVar2 = (aeh) this.c.get(context);
                if (aehVar2 == null) {
                    aehVar2 = new aeh();
                    this.c.put(context, aehVar2);
                }
                aehVar2.h(i, colorStateList);
                return colorStateList;
            }
            colorStateList2 = colorStateList;
        }
        return colorStateList2;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized void f(Context context) {
        aee aeeVar = (aee) this.f.get(context);
        if (aeeVar != null) {
            aeeVar.j();
        }
    }

    public final synchronized void g(xb xbVar) {
        this.i = xbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0189, code lost:
    
        r0.setTintMode(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec A[Catch: all -> 0x0289, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0153, B:40:0x0117, B:42:0x0133, B:44:0x013d, B:46:0x0147, B:48:0x015e, B:50:0x0164, B:52:0x016a, B:54:0x0170, B:55:0x0174, B:59:0x0189, B:62:0x027a, B:68:0x0185, B:69:0x018f, B:73:0x01a6, B:74:0x01cd, B:78:0x01d8, B:80:0x0202, B:84:0x0257, B:86:0x025d, B:87:0x0263, B:89:0x0270, B:91:0x0219, B:94:0x022a, B:96:0x0234, B:100:0x023e, B:108:0x007d, B:110:0x0081, B:113:0x008f, B:114:0x0097, B:119:0x00a0, B:120:0x00a7, B:122:0x00a8, B:124:0x00bb, B:126:0x00c5, B:128:0x00cf, B:130:0x00d8, B:131:0x0057, B:133:0x000e, B:135:0x0019, B:137:0x001d, B:139:0x027f, B:140:0x0288), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0153 A[Catch: all -> 0x0289, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0153, B:40:0x0117, B:42:0x0133, B:44:0x013d, B:46:0x0147, B:48:0x015e, B:50:0x0164, B:52:0x016a, B:54:0x0170, B:55:0x0174, B:59:0x0189, B:62:0x027a, B:68:0x0185, B:69:0x018f, B:73:0x01a6, B:74:0x01cd, B:78:0x01d8, B:80:0x0202, B:84:0x0257, B:86:0x025d, B:87:0x0263, B:89:0x0270, B:91:0x0219, B:94:0x022a, B:96:0x0234, B:100:0x023e, B:108:0x007d, B:110:0x0081, B:113:0x008f, B:114:0x0097, B:119:0x00a0, B:120:0x00a7, B:122:0x00a8, B:124:0x00bb, B:126:0x00c5, B:128:0x00cf, B:130:0x00d8, B:131:0x0057, B:133:0x000e, B:135:0x0019, B:137:0x001d, B:139:0x027f, B:140:0x0288), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e A[Catch: all -> 0x0289, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0153, B:40:0x0117, B:42:0x0133, B:44:0x013d, B:46:0x0147, B:48:0x015e, B:50:0x0164, B:52:0x016a, B:54:0x0170, B:55:0x0174, B:59:0x0189, B:62:0x027a, B:68:0x0185, B:69:0x018f, B:73:0x01a6, B:74:0x01cd, B:78:0x01d8, B:80:0x0202, B:84:0x0257, B:86:0x025d, B:87:0x0263, B:89:0x0270, B:91:0x0219, B:94:0x022a, B:96:0x0234, B:100:0x023e, B:108:0x007d, B:110:0x0081, B:113:0x008f, B:114:0x0097, B:119:0x00a0, B:120:0x00a7, B:122:0x00a8, B:124:0x00bb, B:126:0x00c5, B:128:0x00cf, B:130:0x00d8, B:131:0x0057, B:133:0x000e, B:135:0x0019, B:137:0x001d, B:139:0x027f, B:140:0x0288), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164 A[Catch: all -> 0x0289, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0153, B:40:0x0117, B:42:0x0133, B:44:0x013d, B:46:0x0147, B:48:0x015e, B:50:0x0164, B:52:0x016a, B:54:0x0170, B:55:0x0174, B:59:0x0189, B:62:0x027a, B:68:0x0185, B:69:0x018f, B:73:0x01a6, B:74:0x01cd, B:78:0x01d8, B:80:0x0202, B:84:0x0257, B:86:0x025d, B:87:0x0263, B:89:0x0270, B:91:0x0219, B:94:0x022a, B:96:0x0234, B:100:0x023e, B:108:0x007d, B:110:0x0081, B:113:0x008f, B:114:0x0097, B:119:0x00a0, B:120:0x00a7, B:122:0x00a8, B:124:0x00bb, B:126:0x00c5, B:128:0x00cf, B:130:0x00d8, B:131:0x0057, B:133:0x000e, B:135:0x0019, B:137:0x001d, B:139:0x027f, B:140:0x0288), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x027a A[Catch: all -> 0x0289, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0153, B:40:0x0117, B:42:0x0133, B:44:0x013d, B:46:0x0147, B:48:0x015e, B:50:0x0164, B:52:0x016a, B:54:0x0170, B:55:0x0174, B:59:0x0189, B:62:0x027a, B:68:0x0185, B:69:0x018f, B:73:0x01a6, B:74:0x01cd, B:78:0x01d8, B:80:0x0202, B:84:0x0257, B:86:0x025d, B:87:0x0263, B:89:0x0270, B:91:0x0219, B:94:0x022a, B:96:0x0234, B:100:0x023e, B:108:0x007d, B:110:0x0081, B:113:0x008f, B:114:0x0097, B:119:0x00a0, B:120:0x00a7, B:122:0x00a8, B:124:0x00bb, B:126:0x00c5, B:128:0x00cf, B:130:0x00d8, B:131:0x0057, B:133:0x000e, B:135:0x0019, B:137:0x001d, B:139:0x027f, B:140:0x0288), top: B:3:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }
}
