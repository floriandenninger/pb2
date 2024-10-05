package defpackage;

import android.os.Parcelable;
import android.view.View;
import androidx.preference.TwoStatePreference;
import com.google.android.libraries.youtube.account.inlineauth.settings.QuickPurchaseEnabledPreference;
import com.google.android.libraries.youtube.player.video.state.PlaybackListenerStateRestorerState;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoae {
    public static volatile aoae a;
    public final Set b;

    public aoae(Set set) {
        this.b = set;
    }

    public aoae(Set set, byte[] bArr, byte[] bArr2) {
        this.b = set;
    }

    public aoae(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.b = new HashSet();
    }

    public static aoae U() {
        return new aoae((Collection) amvs.a);
    }

    public static final void z(RuntimeException runtimeException) {
        ((amyf) ((amyf) ((amyf) tik.a.f()).h(runtimeException)).i("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "lambda$provideErrorHandler$0", 19, "FloggerResultDaggerModule.java")).o();
    }

    public final void A(Object obj, int i) {
        if (this.b.isEmpty()) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((tgr) it.next()).g(obj, i);
        }
    }

    public final void B(ouu ouuVar) {
        this.b.add(ouuVar);
    }

    public final void C(ouu ouuVar) {
        this.b.remove(ouuVar);
    }

    public final void D(oiq oiqVar) {
        oiqVar.getClass();
        this.b.add(oiqVar);
    }

    public final void E() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((oiq) it.next()).k();
        }
    }

    public final void F(String str) {
        this.b.add(str);
    }

    public final void G(String str) {
        this.b.remove(str);
    }

    public final boolean H(String str) {
        return this.b.contains(str);
    }

    public final ammv I() {
        Set set = this.b;
        int i = ((aeb) set).b;
        if (i == 1) {
            return set.isEmpty() ? amlr.a : ammv.j((mbn) this.b.iterator().next());
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Expected only one FeedFilterBarLogicController, found ");
        sb.append(i);
        afsi.b(1, 25, sb.toString());
        return amlr.a;
    }

    public final ArrayList J() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.b);
        }
        return arrayList;
    }

    public final void K(imv imvVar) {
        synchronized (this) {
            this.b.add(imvVar);
        }
    }

    public final void L(imv imvVar) {
        synchronized (this) {
            this.b.remove(imvVar);
        }
    }

    public final void M(eke ekeVar) {
        this.b.add(ekeVar);
    }

    public final void N() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((eke) it.next()).c();
        }
    }

    public final void O(ekf ekfVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((eke) it.next()).b(ekfVar);
        }
    }

    public final void P(String str, int i, String str2) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((aoae) it.next()).P(str, i, str2);
        }
    }

    public final void Q(String str, int i, dte dteVar, String str2) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((aoae) it.next()).Q(str, i, dteVar, str2);
        }
    }

    public final void R(String str, int i, int i2, String str2) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((aoae) it.next()).R(str, i, i2, str2);
        }
    }

    public final void S(String str, Object obj, Object obj2, String str2, String str3, Boolean bool, String str4) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((aoae) it.next()).S(str, obj, obj2, str2, str3, bool, str4);
        }
    }

    public final void T(String str, int i, dte dteVar, String str2) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((aoae) it.next()).T(str, i, dteVar, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set a() {
        Set unmodifiableSet;
        synchronized (this.b) {
            unmodifiableSet = Collections.unmodifiableSet(this.b);
        }
        return unmodifiableSet;
    }

    public final synchronized void b(Object obj) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((alpd) it.next()).i(obj);
        }
    }

    public final void c(Object obj, View view) {
        if (this.b.isEmpty()) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ajpb) it.next()).a(obj, view);
        }
    }

    public final PlaybackListenerStateRestorerState d() {
        HashMap hashMap = new HashMap();
        for (ajbh ajbhVar : this.b) {
            Parcelable ai = ajbhVar.ai();
            if (ai != null) {
                hashMap.put(ajbhVar.getClass().toString(), ai);
            }
        }
        return new PlaybackListenerStateRestorerState(hashMap);
    }

    public final amsx e() {
        return amsx.p(this.b);
    }

    public final void f(acvj acvjVar) {
        this.b.add(acvjVar);
        acvjVar.h();
    }

    public final boolean g(apxf apxfVar, apxf apxfVar2) {
        if (amkq.b(apxfVar, apxfVar2)) {
            return true;
        }
        if (apxfVar != null && apxfVar2 != null) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                if (((aags) it.next()).a(apxfVar, apxfVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h(avwy avwyVar) {
        Set set = this.b;
        if (set == null || avwyVar == null) {
            return false;
        }
        return set.contains(avwyVar);
    }

    public final void i(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public final void j(Object obj) {
        this.b.add(obj);
    }

    public final void k(Object obj) {
        this.b.remove(obj);
    }

    public final void l() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((yfi) it.next()).g();
        }
    }

    public final void m() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((yfi) it.next()).h();
        }
    }

    @Deprecated
    public final void n(asfw asfwVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((yfi) it.next()).mJ(asfwVar);
        }
    }

    public final void o(yfi yfiVar) {
        this.b.add(yfiVar);
    }

    public final void p(yfi yfiVar) {
        this.b.remove(yfiVar);
    }

    public final zfk q(yen yenVar) {
        Set set = this.b;
        yenVar.getClass();
        set.add(yenVar);
        return new yem(this, yenVar, null, null, null);
    }

    public final void r(won wonVar) {
        this.b.add(wonVar);
    }

    public final void s() {
        this.b.clear();
    }

    public final void t(boolean z, boolean z2) {
        if (z) {
            for (QuickPurchaseEnabledPreference quickPurchaseEnabledPreference : this.b) {
                if (z2 && !((TwoStatePreference) quickPurchaseEnabledPreference).a) {
                    quickPurchaseEnabledPreference.c.d(quickPurchaseEnabledPreference.d, true);
                    quickPurchaseEnabledPreference.k(true);
                }
            }
            return;
        }
        for (QuickPurchaseEnabledPreference quickPurchaseEnabledPreference2 : this.b) {
        }
    }

    public final void u() {
        this.b.add(vkc.CENTER_CROP);
    }

    public final void v(PlaybackListenerStateRestorerState playbackListenerStateRestorerState, ansv ansvVar) {
        Map map = playbackListenerStateRestorerState.a;
        for (ajbh ajbhVar : this.b) {
            Parcelable parcelable = (Parcelable) map.get(ajbhVar.getClass().toString());
            if (parcelable != null) {
                ajbhVar.f(parcelable, ansvVar);
            }
        }
    }

    public final void w(Object obj) {
        if (this.b.isEmpty()) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((tgr) it.next()).b(obj);
        }
    }

    public final void x(Object obj) {
        if (this.b.isEmpty()) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((tgr) it.next()).d(obj);
        }
    }

    public final boolean y() {
        return !this.b.isEmpty();
    }

    public aoae(char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = new HashSet();
    }

    public aoae(byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = new HashSet();
    }

    public aoae(short[] sArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    public aoae(byte[] bArr, byte[] bArr2, char[] cArr, byte[] bArr3) {
        this.b = new HashSet();
    }

    public aoae(char[] cArr, byte[] bArr, char[] cArr2) {
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    public aoae(byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3) {
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    public aoae(short[] sArr, char[] cArr) {
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    public aoae(byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        this.b = new aeb();
    }

    public aoae(char[] cArr, char[] cArr2) {
        this.b = new HashSet();
    }

    public aoae(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    public aoae(byte[] bArr, short[] sArr) {
        this.b = new HashSet();
    }

    public aoae(boolean[] zArr) {
        this.b = Collections.synchronizedSet(new HashSet());
    }

    public aoae(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = new HashSet();
    }

    public aoae(char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    public aoae(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.b = new HashSet();
    }

    public aoae(short[] sArr, byte[] bArr, byte[] bArr2) {
        this.b = new HashSet();
    }

    public aoae(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = new HashSet();
    }

    public aoae(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    public aoae(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap(4)));
    }

    public aoae(int[] iArr) {
        this.b = Collections.synchronizedSet(new HashSet());
    }

    public aoae(short[] sArr, byte[] bArr) {
        this.b = Collections.synchronizedSet(new HashSet());
    }

    public aoae(Collection collection) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.b = copyOnWriteArraySet;
        collection.getClass();
        amkq.E(!collection.contains(null));
        copyOnWriteArraySet.addAll(collection);
    }

    public aoae(Set set, byte[] bArr) {
        set.getClass();
        this.b = set;
    }

    public aoae(char[] cArr, byte[] bArr) {
        this.b = amkq.ar();
    }

    public aoae(byte[] bArr, char[] cArr) {
        this.b = new HashSet();
    }

    public aoae(short[] sArr) {
        this.b = new HashSet();
    }

    public aoae(byte[] bArr, byte[] bArr2) {
        this.b = new HashSet();
    }

    public aoae(char[] cArr) {
        this.b = new HashSet();
    }

    public aoae() {
        this.b = new HashSet();
    }

    public aoae(byte[] bArr) {
        this.b = new HashSet();
    }
}
