package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qq implements gj {
    private static final int[] j = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public qo b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public qt h;
    public boolean i;
    private final Resources k;
    private boolean l;
    private final boolean m;
    private final ArrayList n;
    private boolean o;
    private final ArrayList p;
    private boolean q;
    private int r = 0;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private final ArrayList w = new ArrayList();
    private final CopyOnWriteArrayList x = new CopyOnWriteArrayList();
    private boolean y = false;

    public qq(Context context) {
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.k = resources;
        this.c = new ArrayList();
        this.n = new ArrayList();
        this.o = true;
        this.d = new ArrayList();
        this.p = new ArrayList();
        this.q = true;
        if (resources.getConfiguration().keyboard != 1 && jx.d(ViewConfiguration.get(context), context)) {
            z = true;
        }
        this.m = z;
    }

    private final void E(int i, boolean z) {
        if (i < 0 || i >= this.c.size()) {
            return;
        }
        this.c.remove(i);
        if (z) {
            l(true);
        }
    }

    public final boolean A(MenuItem menuItem, re reVar, int i) {
        boolean f;
        qt qtVar = (qt) menuItem;
        if (qtVar != null && qtVar.isEnabled()) {
            boolean n = qtVar.n();
            id idVar = qtVar.o;
            boolean z = idVar != null && idVar.d();
            if (qtVar.m()) {
                n |= qtVar.expandActionView();
                if (n) {
                    i(true);
                    return true;
                }
            } else if (qtVar.hasSubMenu() || z) {
                if ((i & 4) == 0) {
                    i(false);
                }
                if (!qtVar.hasSubMenu()) {
                    qtVar.l(new rm(this.a, this, qtVar));
                }
                rm rmVar = qtVar.k;
                if (z) {
                    idVar.c(rmVar);
                }
                if (this.x.isEmpty()) {
                    f = false;
                } else {
                    f = reVar != null ? reVar.f(rmVar) : false;
                    Iterator it = this.x.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        re reVar2 = (re) weakReference.get();
                        if (reVar2 == null) {
                            this.x.remove(weakReference);
                        } else if (!f) {
                            f = reVar2.f(rmVar);
                        }
                    }
                }
                n |= f;
                if (!n) {
                    i(true);
                }
            } else if ((i & 1) == 0) {
                i(true);
                return n;
            }
            return n;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B() {
        this.q = true;
        l(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C() {
        this.o = true;
        l(true);
    }

    public final void D() {
        this.r = 1;
    }

    public qq a() {
        return this;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(0, 0, 0, this.k.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem c = c(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c.setIcon(resolveInfo.loadIcon(packageManager));
            ((qt) c).e = intent2;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = c;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.k.getString(i));
    }

    final qt b(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.w;
        arrayList.clear();
        j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (qt) arrayList.get(0);
        }
        boolean x = x();
        for (int i2 = 0; i2 < size; i2++) {
            qt qtVar = (qt) arrayList.get(i2);
            char c = x ? qtVar.h : qtVar.f;
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (x && c == '\b' && i == 67))) {
                return qtVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (j[i5] << 16) | ((char) i3);
        qt qtVar = new qt(this, i, i2, i3, i6, charSequence, this.r);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((qt) arrayList.get(size)).c <= i6) {
                i4 = size + 1;
                break;
            }
        }
        arrayList.add(i4, qtVar);
        l(true);
        return qtVar;
    }

    @Override // android.view.Menu
    public final void clear() {
        qt qtVar = this.h;
        if (qtVar != null) {
            t(qtVar);
        }
        this.c.clear();
        l(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        l(false);
    }

    @Override // android.view.Menu
    public final void close() {
        i(true);
    }

    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        k();
        return this.p;
    }

    public final ArrayList f() {
        if (!this.o) {
            return this.n;
        }
        this.n.clear();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            qt qtVar = (qt) this.c.get(i);
            if (qtVar.isVisible()) {
                this.n.add(qtVar);
            }
        }
        this.o = false;
        this.q = true;
        return this.n;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            qt qtVar = (qt) this.c.get(i2);
            if (qtVar.a == i) {
                return qtVar;
            }
            if (qtVar.hasSubMenu() && (findItem = qtVar.k.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final void g(re reVar) {
        h(reVar, this.a);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    public final void h(re reVar, Context context) {
        this.x.add(new WeakReference(reVar));
        reVar.b(context, this);
        this.q = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.i) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((qt) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            re reVar = (re) weakReference.get();
            if (reVar == null) {
                this.x.remove(weakReference);
            } else {
                reVar.c(this, z);
            }
        }
        this.v = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return b(i, keyEvent) != null;
    }

    final void j(List list, int i, KeyEvent keyEvent) {
        int i2;
        boolean x = x();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                qt qtVar = (qt) this.c.get(i3);
                if (qtVar.hasSubMenu()) {
                    qtVar.k.j(list, i, keyEvent);
                }
                char c = x ? qtVar.h : qtVar.f;
                if (x) {
                    i2 = qtVar.i;
                } else {
                    i2 = qtVar.g;
                }
                if ((modifiers & 69647) == (i2 & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (x && c == '\b' && i == 67)) && qtVar.isEnabled())) {
                    list.add(qtVar);
                }
            }
        }
    }

    public final void k() {
        ArrayList f = f();
        if (this.q) {
            Iterator it = this.x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                re reVar = (re) weakReference.get();
                if (reVar == null) {
                    this.x.remove(weakReference);
                } else {
                    z |= reVar.e();
                }
            }
            if (z) {
                this.d.clear();
                this.p.clear();
                int size = f.size();
                for (int i = 0; i < size; i++) {
                    qt qtVar = (qt) f.get(i);
                    if (qtVar.o()) {
                        this.d.add(qtVar);
                    } else {
                        this.p.add(qtVar);
                    }
                }
            } else {
                this.d.clear();
                this.p.clear();
                this.p.addAll(f());
            }
            this.q = false;
        }
    }

    public final void l(boolean z) {
        if (this.s) {
            this.t = true;
            if (z) {
                this.u = true;
                return;
            }
            return;
        }
        if (z) {
            this.o = true;
            this.q = true;
        }
        if (this.x.isEmpty()) {
            return;
        }
        s();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            re reVar = (re) weakReference.get();
            if (reVar == null) {
                this.x.remove(weakReference);
            } else {
                reVar.i();
            }
        }
        r();
    }

    public final void m(re reVar) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            re reVar2 = (re) weakReference.get();
            if (reVar2 == null || reVar2 == reVar) {
                this.x.remove(weakReference);
            }
        }
    }

    public final void n(Bundle bundle) {
        MenuItem findItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((rm) item.getSubMenu()).n(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public final void o(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((rm) item.getSubMenu()).o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void p(qo qoVar) {
        this.b = qoVar;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return z(findItem(i), i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        qt b = b(i, keyEvent);
        boolean z = b != null ? z(b, i2) : false;
        if ((i2 & 2) != 0) {
            i(true);
        }
        return z;
    }

    public final void r() {
        this.s = false;
        if (this.t) {
            this.t = false;
            l(this.u);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((qt) this.c.get(i2)).b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((qt) this.c.get(i2)).b != i) {
                    break;
                }
                E(i2, false);
                i3 = i4;
            }
            l(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((qt) this.c.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        E(i2, true);
    }

    public final void s() {
        if (this.s) {
            return;
        }
        this.s = true;
        this.t = false;
        this.u = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            qt qtVar = (qt) this.c.get(i2);
            if (qtVar.b == i) {
                qtVar.j(z2);
                qtVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            qt qtVar = (qt) this.c.get(i2);
            if (qtVar.b == i) {
                qtVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int size = this.c.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            qt qtVar = (qt) this.c.get(i2);
            if (qtVar.b == i && qtVar.s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            l(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.l = z;
        l(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public boolean t(qt qtVar) {
        boolean z = false;
        if (!this.x.isEmpty() && this.h == qtVar) {
            s();
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                re reVar = (re) weakReference.get();
                if (reVar == null) {
                    this.x.remove(weakReference);
                } else {
                    z = reVar.g(qtVar);
                    if (z) {
                        break;
                    }
                }
            }
            r();
            if (z) {
                this.h = null;
            }
        }
        return z;
    }

    public boolean u(qq qqVar, MenuItem menuItem) {
        qo qoVar = this.b;
        return qoVar != null && qoVar.Q(qqVar, menuItem);
    }

    public boolean v(qt qtVar) {
        boolean z = false;
        if (this.x.isEmpty()) {
            return false;
        }
        s();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            re reVar = (re) weakReference.get();
            if (reVar == null) {
                this.x.remove(weakReference);
            } else {
                z = reVar.h(qtVar);
                if (z) {
                    break;
                }
            }
        }
        r();
        if (z) {
            this.h = qtVar;
        }
        return z;
    }

    public boolean w() {
        return this.y;
    }

    public boolean x() {
        return this.l;
    }

    public boolean y() {
        return this.m;
    }

    public final boolean z(MenuItem menuItem, int i) {
        return A(menuItem, null, i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.k.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.k.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        qt qtVar = (qt) c(i, i2, i3, charSequence);
        rm rmVar = new rm(this.a, this, qtVar);
        qtVar.l(rmVar);
        return rmVar;
    }

    public final void q(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.k;
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = resources.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = aii.a(this.a, i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        l(false);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
