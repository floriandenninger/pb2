package com.google.android.libraries.notifications.data.impl.room;

import defpackage.bte;
import defpackage.btj;
import defpackage.btt;
import defpackage.bug;
import defpackage.buh;
import defpackage.bui;
import defpackage.buk;
import defpackage.txs;
import defpackage.txt;
import defpackage.txw;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChimePerAccountRoomDatabase_Impl extends ChimePerAccountRoomDatabase {
    private volatile txt i;

    @Override // defpackage.btl
    protected final btj a() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new btj(this, hashMap, "chime_thread_states");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btl
    public final buk b(bte bteVar) {
        bug bugVar = new bug(bteVar, new txs(this), "ea4ce6093b9d29b56181718d906e0024", "7b4a6a59292e18bdb45d33bd6152c7d2");
        buh a = bui.a(bteVar.b);
        a.b = bteVar.c;
        a.c = bugVar;
        return bteVar.a.a(a.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btl
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put(txt.class, Collections.emptyList());
        return hashMap;
    }

    @Override // defpackage.btl
    public final Set d() {
        return new HashSet();
    }

    @Override // defpackage.btl
    public final List m() {
        return Arrays.asList(new btt[0]);
    }

    @Override // com.google.android.libraries.notifications.data.impl.room.ChimePerAccountRoomDatabase
    public final txt q() {
        txt txtVar;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new txw(this);
            }
            txtVar = this.i;
        }
        return txtVar;
    }
}
