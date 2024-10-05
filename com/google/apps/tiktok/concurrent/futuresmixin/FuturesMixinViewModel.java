package com.google.apps.tiktok.concurrent.futuresmixin;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel;
import com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture;
import defpackage.amcd;
import defpackage.amcn;
import defpackage.amkq;
import defpackage.aph;
import defpackage.apm;
import defpackage.bub;
import defpackage.uqq;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FuturesMixinViewModel extends apm implements amcn {
    public final Executor a;
    public final Set c;
    public final amcd b = new amcd("FuturesMixinRF");
    public boolean d = false;

    public FuturesMixinViewModel(aph aphVar, Executor executor) {
        this.a = executor;
        Bundle bundle = (Bundle) aphVar.b.get("future_saved_state");
        if (bundle != null) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("future_wrappers");
            this.c = new HashSet(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                this.c.add((ParcelableFuture) parcelable);
            }
        } else {
            this.c = new HashSet(1);
        }
        amcd amcdVar = this.b;
        uqq.j();
        if (bundle != null) {
            String str = amcdVar.b;
            String concat = str.length() != 0 ? "CallbackIdMap.classes".concat(str) : new String("CallbackIdMap.classes");
            amkq.O(bundle.containsKey(concat), "CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            String[] stringArray = bundle.getStringArray(concat);
            String str2 = amcdVar.b;
            int[] intArray = bundle.getIntArray(str2.length() != 0 ? "CallbackIdMap.class_ids".concat(str2) : new String("CallbackIdMap.class_ids"));
            for (int i = 0; i < stringArray.length; i++) {
                try {
                    Integer num = (Integer) amcdVar.d.put(Class.forName(stringArray[i]), Integer.valueOf(intArray[i]));
                    if (num != null) {
                        int intValue = num.intValue();
                        int i2 = intArray[i];
                        amkq.U(intValue == i2, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", stringArray[i], Integer.valueOf(i2), num);
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        aphVar.c.put("future_saved_state", new bub() { // from class: amcj
            @Override // defpackage.bub
            public final Bundle a() {
                FuturesMixinViewModel futuresMixinViewModel = FuturesMixinViewModel.this;
                Bundle bundle2 = new Bundle();
                Set set = futuresMixinViewModel.c;
                bundle2.putParcelableArray("future_wrappers", (Parcelable[]) set.toArray(new ParcelableFuture[set.size()]));
                amcd amcdVar2 = futuresMixinViewModel.b;
                uqq.j();
                String str3 = amcdVar2.b;
                String concat2 = str3.length() != 0 ? "CallbackIdMap.classes".concat(str3) : new String("CallbackIdMap.classes");
                amkq.Q(!bundle2.containsKey(concat2), "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", concat2);
                adz adzVar = amcdVar2.d;
                int i3 = adzVar.j;
                String[] strArr = new String[i3];
                int[] iArr = new int[i3];
                int i4 = 0;
                for (Map.Entry entry : adzVar.entrySet()) {
                    strArr[i4] = ((Class) entry.getKey()).getName();
                    iArr[i4] = ((Integer) entry.getValue()).intValue();
                    i4++;
                }
                bundle2.putStringArray(concat2, strArr);
                String str4 = amcdVar2.b;
                bundle2.putIntArray(str4.length() != 0 ? "CallbackIdMap.class_ids".concat(str4) : new String("CallbackIdMap.class_ids"), iArr);
                return bundle2;
            }
        });
    }
}
