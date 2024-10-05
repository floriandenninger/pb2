package defpackage;

import com.google.apps.tiktok.account.AutoValue_AccountId;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amgg implements Runnable {
    public final /* synthetic */ amgk a;
    public final /* synthetic */ Set b;
    private final /* synthetic */ int c;

    public /* synthetic */ amgg(amgk amgkVar, Set set, int i) {
        this.c = i;
        this.a = amgkVar;
        this.b = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amgk amgkVar;
        if (this.c != 0) {
            amgkVar = this.a;
            Set set = this.b;
            amgkVar.b.writeLock().lock();
            try {
                amhd amhdVar = amhd.a;
                try {
                    amhdVar = amgkVar.a();
                } catch (IOException e) {
                    if (!amgkVar.f(e)) {
                        ((amxh) ((amxh) ((amxh) amgk.a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$removeSyncRequests$6", (char) 405, "SyncManagerDataStore.java")).q("Unable to read or clear store. Cannot remove account.");
                        return;
                    }
                }
                aone createBuilder = amhd.a.createBuilder();
                createBuilder.mergeFrom((aonm) amhdVar);
                createBuilder.copyOnWrite();
                ((amhd) createBuilder.instance).d = amhd.emptyProtobufList();
                for (amhc amhcVar : amhdVar.d) {
                    amhf amhfVar = amhcVar.c;
                    if (amhfVar == null) {
                        amhfVar = amhf.a;
                    }
                    if (!set.contains(amgr.a(amhfVar))) {
                        createBuilder.H(amhcVar);
                    }
                }
                try {
                    amgkVar.e((amhd) createBuilder.build());
                } catch (IOException e2) {
                    ((amxh) ((amxh) ((amxh) amgk.a.f()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$removeSyncRequests$6", (char) 425, "SyncManagerDataStore.java")).q("Error writing sync data file. Cannot remove account.");
                }
                return;
            } catch (Throwable th) {
                throw th;
            }
        }
        amgkVar = this.a;
        Set<amgr> set2 = this.b;
        amgkVar.b.writeLock().lock();
        try {
            amhd amhdVar2 = amhd.a;
            try {
                amhdVar2 = amgkVar.a();
            } catch (IOException e3) {
                if (!amgkVar.f(e3)) {
                    ((amxh) ((amxh) ((amxh) amgk.a.f()).h(e3)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateScheduledAccountIds$5", (char) 365, "SyncManagerDataStore.java")).q("Unable to read or clear store, will not update scheduled account ids. ");
                }
            }
            aone createBuilder2 = amhd.a.createBuilder();
            createBuilder2.mergeFrom((aonm) amhdVar2);
            createBuilder2.copyOnWrite();
            ((amhd) createBuilder2.instance).f = amhd.emptyIntList();
            TreeSet treeSet = new TreeSet();
            for (amgr amgrVar : set2) {
                if (amgrVar.b()) {
                    treeSet.add(Integer.valueOf(((AutoValue_AccountId) amgrVar.c).a));
                }
            }
            createBuilder2.copyOnWrite();
            amhd amhdVar3 = (amhd) createBuilder2.instance;
            aonu aonuVar = amhdVar3.f;
            if (!aonuVar.c()) {
                amhdVar3.f = aonm.mutableCopy(aonuVar);
            }
            aolo.addAll((Iterable) treeSet, (List) amhdVar3.f);
            try {
                amgkVar.e((amhd) createBuilder2.build());
            } catch (IOException e4) {
                ((amxh) ((amxh) ((amxh) amgk.a.f()).h(e4)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateScheduledAccountIds$5", (char) 386, "SyncManagerDataStore.java")).q("Error writing scheduled account ids");
            }
        } finally {
            amgkVar.b.writeLock().unlock();
        }
    }
}
