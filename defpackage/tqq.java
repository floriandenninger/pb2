package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tqq implements trh {
    public final Context a;
    public final tme b;
    private final Executor c;
    private final tko d;
    private final vgz e;

    public tqq(Context context, tme tmeVar, vgz vgzVar, Executor executor, tko tkoVar) {
        this.a = context;
        this.b = tmeVar;
        this.e = vgzVar;
        this.c = executor;
        this.d = tkoVar;
    }

    @Override // defpackage.trh
    public final anhy a() {
        return this.e.b(tqf.q, this.c);
    }

    public final anhy b(final tpr tprVar, final int i) {
        anhy h;
        final int i2 = 1;
        if (i <= tprVar.d) {
            tpr a = tpr.a(i);
            int ordinal = a.ordinal();
            final int i3 = 2;
            if (ordinal == 1) {
                h = aney.h(anfq.h(anht.q(this.e.b(new amml(this) { // from class: tqn
                    public final /* synthetic */ tqq a;

                    {
                        this.a = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        int i4 = i2;
                        if (i4 == 0) {
                            tqq tqqVar = this.a;
                            tlj tljVar = (tlj) obj;
                            int i5 = tsx.a;
                            aone builder = tljVar.toBuilder();
                            for (String str : Collections.unmodifiableMap(tljVar.b).keySet()) {
                                try {
                                    tlg az = rwh.az(str, tqqVar.a, tqqVar.b);
                                    str.getClass();
                                    aoot aootVar = tljVar.b;
                                    tlh tlhVar = aootVar.containsKey(str) ? (tlh) aootVar.get(str) : null;
                                    builder.A(str);
                                    if (tlhVar == null) {
                                        tsx.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                    } else {
                                        builder.z(rwh.aC(az), tlhVar);
                                    }
                                } catch (ttn e) {
                                    tsx.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                                    tqqVar.b.a(e, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                    builder.A(str);
                                }
                            }
                            return (tlj) builder.build();
                        }
                        if (i4 != 1) {
                            if (i4 == 2) {
                                tqq tqqVar2 = this.a;
                                tsx.b("Failed to commit migration metadata to disk");
                                tqqVar2.b.a(new Exception("Migration to DownloadTransform failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
                                return false;
                            }
                            tqq tqqVar3 = this.a;
                            tsx.b("Failed to commit migration metadata to disk");
                            tqqVar3.b.a(new Exception("Migration to ChecksumOnly failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
                            return false;
                        }
                        tqq tqqVar4 = this.a;
                        tlj tljVar2 = (tlj) obj;
                        int i6 = tsx.a;
                        aone builder2 = tljVar2.toBuilder();
                        for (String str2 : Collections.unmodifiableMap(tljVar2.b).keySet()) {
                            try {
                                tlg az2 = rwh.az(str2, tqqVar4.a, tqqVar4.b);
                                str2.getClass();
                                aoot aootVar2 = tljVar2.b;
                                tlh tlhVar2 = aootVar2.containsKey(str2) ? (tlh) aootVar2.get(str2) : null;
                                builder2.A(str2);
                                if (tlhVar2 == null) {
                                    tsx.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                } else {
                                    builder2.z(rwh.aD(az2), tlhVar2);
                                }
                            } catch (ttn e2) {
                                tsx.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str2);
                                tqqVar4.b.a(e2, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                builder2.A(str2);
                            }
                        }
                        return (tlj) builder2.build();
                    }
                }, this.c)), tqf.m, this.c), IOException.class, new amml(this) { // from class: tqn
                    public final /* synthetic */ tqq a;

                    {
                        this.a = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        int i4 = i3;
                        if (i4 == 0) {
                            tqq tqqVar = this.a;
                            tlj tljVar = (tlj) obj;
                            int i5 = tsx.a;
                            aone builder = tljVar.toBuilder();
                            for (String str : Collections.unmodifiableMap(tljVar.b).keySet()) {
                                try {
                                    tlg az = rwh.az(str, tqqVar.a, tqqVar.b);
                                    str.getClass();
                                    aoot aootVar = tljVar.b;
                                    tlh tlhVar = aootVar.containsKey(str) ? (tlh) aootVar.get(str) : null;
                                    builder.A(str);
                                    if (tlhVar == null) {
                                        tsx.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                    } else {
                                        builder.z(rwh.aC(az), tlhVar);
                                    }
                                } catch (ttn e) {
                                    tsx.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                                    tqqVar.b.a(e, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                    builder.A(str);
                                }
                            }
                            return (tlj) builder.build();
                        }
                        if (i4 != 1) {
                            if (i4 == 2) {
                                tqq tqqVar2 = this.a;
                                tsx.b("Failed to commit migration metadata to disk");
                                tqqVar2.b.a(new Exception("Migration to DownloadTransform failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
                                return false;
                            }
                            tqq tqqVar3 = this.a;
                            tsx.b("Failed to commit migration metadata to disk");
                            tqqVar3.b.a(new Exception("Migration to ChecksumOnly failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
                            return false;
                        }
                        tqq tqqVar4 = this.a;
                        tlj tljVar2 = (tlj) obj;
                        int i6 = tsx.a;
                        aone builder2 = tljVar2.toBuilder();
                        for (String str2 : Collections.unmodifiableMap(tljVar2.b).keySet()) {
                            try {
                                tlg az2 = rwh.az(str2, tqqVar4.a, tqqVar4.b);
                                str2.getClass();
                                aoot aootVar2 = tljVar2.b;
                                tlh tlhVar2 = aootVar2.containsKey(str2) ? (tlh) aootVar2.get(str2) : null;
                                builder2.A(str2);
                                if (tlhVar2 == null) {
                                    tsx.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                } else {
                                    builder2.z(rwh.aD(az2), tlhVar2);
                                }
                            } catch (ttn e2) {
                                tsx.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str2);
                                tqqVar4.b.a(e2, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                builder2.A(str2);
                            }
                        }
                        return (tlj) builder2.build();
                    }
                }, this.c);
            } else if (ordinal == 2) {
                final int i4 = 0;
                anhy h2 = anfq.h(anht.q(this.e.b(new amml(this) { // from class: tqn
                    public final /* synthetic */ tqq a;

                    {
                        this.a = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        int i42 = i4;
                        if (i42 == 0) {
                            tqq tqqVar = this.a;
                            tlj tljVar = (tlj) obj;
                            int i5 = tsx.a;
                            aone builder = tljVar.toBuilder();
                            for (String str : Collections.unmodifiableMap(tljVar.b).keySet()) {
                                try {
                                    tlg az = rwh.az(str, tqqVar.a, tqqVar.b);
                                    str.getClass();
                                    aoot aootVar = tljVar.b;
                                    tlh tlhVar = aootVar.containsKey(str) ? (tlh) aootVar.get(str) : null;
                                    builder.A(str);
                                    if (tlhVar == null) {
                                        tsx.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                    } else {
                                        builder.z(rwh.aC(az), tlhVar);
                                    }
                                } catch (ttn e) {
                                    tsx.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                                    tqqVar.b.a(e, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                    builder.A(str);
                                }
                            }
                            return (tlj) builder.build();
                        }
                        if (i42 != 1) {
                            if (i42 == 2) {
                                tqq tqqVar2 = this.a;
                                tsx.b("Failed to commit migration metadata to disk");
                                tqqVar2.b.a(new Exception("Migration to DownloadTransform failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
                                return false;
                            }
                            tqq tqqVar3 = this.a;
                            tsx.b("Failed to commit migration metadata to disk");
                            tqqVar3.b.a(new Exception("Migration to ChecksumOnly failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
                            return false;
                        }
                        tqq tqqVar4 = this.a;
                        tlj tljVar2 = (tlj) obj;
                        int i6 = tsx.a;
                        aone builder2 = tljVar2.toBuilder();
                        for (String str2 : Collections.unmodifiableMap(tljVar2.b).keySet()) {
                            try {
                                tlg az2 = rwh.az(str2, tqqVar4.a, tqqVar4.b);
                                str2.getClass();
                                aoot aootVar2 = tljVar2.b;
                                tlh tlhVar2 = aootVar2.containsKey(str2) ? (tlh) aootVar2.get(str2) : null;
                                builder2.A(str2);
                                if (tlhVar2 == null) {
                                    tsx.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                } else {
                                    builder2.z(rwh.aD(az2), tlhVar2);
                                }
                            } catch (ttn e2) {
                                tsx.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str2);
                                tqqVar4.b.a(e2, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                builder2.A(str2);
                            }
                        }
                        return (tlj) builder2.build();
                    }
                }, this.c)), tqf.n, this.c);
                final int i5 = 3;
                h = aney.h(h2, IOException.class, new amml(this) { // from class: tqn
                    public final /* synthetic */ tqq a;

                    {
                        this.a = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        int i42 = i5;
                        if (i42 == 0) {
                            tqq tqqVar = this.a;
                            tlj tljVar = (tlj) obj;
                            int i52 = tsx.a;
                            aone builder = tljVar.toBuilder();
                            for (String str : Collections.unmodifiableMap(tljVar.b).keySet()) {
                                try {
                                    tlg az = rwh.az(str, tqqVar.a, tqqVar.b);
                                    str.getClass();
                                    aoot aootVar = tljVar.b;
                                    tlh tlhVar = aootVar.containsKey(str) ? (tlh) aootVar.get(str) : null;
                                    builder.A(str);
                                    if (tlhVar == null) {
                                        tsx.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                    } else {
                                        builder.z(rwh.aC(az), tlhVar);
                                    }
                                } catch (ttn e) {
                                    tsx.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                                    tqqVar.b.a(e, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                    builder.A(str);
                                }
                            }
                            return (tlj) builder.build();
                        }
                        if (i42 != 1) {
                            if (i42 == 2) {
                                tqq tqqVar2 = this.a;
                                tsx.b("Failed to commit migration metadata to disk");
                                tqqVar2.b.a(new Exception("Migration to DownloadTransform failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
                                return false;
                            }
                            tqq tqqVar3 = this.a;
                            tsx.b("Failed to commit migration metadata to disk");
                            tqqVar3.b.a(new Exception("Migration to ChecksumOnly failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
                            return false;
                        }
                        tqq tqqVar4 = this.a;
                        tlj tljVar2 = (tlj) obj;
                        int i6 = tsx.a;
                        aone builder2 = tljVar2.toBuilder();
                        for (String str2 : Collections.unmodifiableMap(tljVar2.b).keySet()) {
                            try {
                                tlg az2 = rwh.az(str2, tqqVar4.a, tqqVar4.b);
                                str2.getClass();
                                aoot aootVar2 = tljVar2.b;
                                tlh tlhVar2 = aootVar2.containsKey(str2) ? (tlh) aootVar2.get(str2) : null;
                                builder2.A(str2);
                                if (tlhVar2 == null) {
                                    tsx.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                                } else {
                                    builder2.z(rwh.aD(az2), tlhVar2);
                                }
                            } catch (ttn e2) {
                                tsx.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str2);
                                tqqVar4.b.a(e2, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                builder2.A(str2);
                            }
                        }
                        return (tlj) builder2.build();
                    }
                }, this.c);
            } else {
                String name = a.name();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 33);
                sb.append("Upgrade to version ");
                sb.append(name);
                sb.append("not supported!");
                h = anaf.N(new UnsupportedOperationException(sb.toString()));
            }
            return anfq.i(h, new anfz() { // from class: tql
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    tqq tqqVar = tqq.this;
                    int i6 = i;
                    tpr tprVar2 = tprVar;
                    if (((Boolean) obj).booleanValue()) {
                        rwh.bh(tqqVar.a, tpr.a(i6));
                        return tqqVar.b(tprVar2, i6 + 1);
                    }
                    return anaf.O(false);
                }
            }, this.c);
        }
        return anaf.O(true);
    }

    @Override // defpackage.trh
    public final anhy c() {
        final AtomicReference atomicReference = new AtomicReference(new ArrayList());
        return anfq.h(this.e.b(new amml() { // from class: tqo
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                tqq tqqVar = tqq.this;
                AtomicReference atomicReference2 = atomicReference;
                tlj tljVar = (tlj) obj;
                ArrayList arrayList = new ArrayList();
                aone builder = tljVar.toBuilder();
                for (String str : Collections.unmodifiableMap(tljVar.b).keySet()) {
                    try {
                        arrayList.add(rwh.az(str, tqqVar.a, tqqVar.b));
                    } catch (ttn e) {
                        builder.A(str);
                        String valueOf = String.valueOf(str);
                        tsx.j(e, valueOf.length() != 0 ? "Failed to deserialize newFileKey:".concat(valueOf) : new String("Failed to deserialize newFileKey:"));
                        tqqVar.b.a(e, "Failed to deserialize newFileKey, unexpected key size: %s", Integer.valueOf(amnm.c("|").h(str).size()));
                    }
                }
                atomicReference2.set(arrayList);
                return (tlj) builder.build();
            }
        }, this.c), new amaa(atomicReference, 1), this.c);
    }

    @Override // defpackage.trh
    public final anhy d() {
        final int i = 0;
        if (rwh.bg(this.a)) {
            this.d.p();
            final tpr a = tpr.a(2);
            tpr bf = rwh.bf(this.a, this.b);
            int i2 = a.d;
            int i3 = bf.d;
            final int i4 = 1;
            if (i2 == i3) {
                return anaf.O(true);
            }
            if (i2 < i3) {
                tsx.e("%s Cannot migrate back from value %s to %s. Clear everything!", "ProtoDataStoreSharedFilesMetadata", bf, a);
                tme tmeVar = this.b;
                String valueOf = String.valueOf(bf);
                String valueOf2 = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
                sb.append("Downgraded file key from ");
                sb.append(valueOf);
                sb.append(" to ");
                sb.append(valueOf2);
                sb.append(".");
                tmeVar.a(new Exception(sb.toString()), "FileKey migrations unexpected downgrade.", new Object[0]);
                rwh.bh(this.a, a);
                return anaf.O(false);
            }
            return anfq.i(aney.i(anht.q(b(a, i3 + 1)), Exception.class, new anfz(this) { // from class: tqm
                public final /* synthetic */ tqq a;

                {
                    this.a = this;
                }

                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    if (i == 0) {
                        this.a.h(a);
                        return anaf.N((Exception) obj);
                    }
                    this.a.h(a);
                    return anaf.O((Boolean) obj);
                }
            }, this.c), new anfz(this) { // from class: tqm
                public final /* synthetic */ tqq a;

                {
                    this.a = this;
                }

                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    if (i4 == 0) {
                        this.a.h(a);
                        return anaf.N((Exception) obj);
                    }
                    this.a.h(a);
                    return anaf.O((Boolean) obj);
                }
            }, this.c);
        }
        int i5 = tsx.a;
        rwh.bi(this.a);
        Context context = this.a;
        this.d.p();
        rwh.bh(context, tpr.a(2));
        return anaf.O(false);
    }

    @Override // defpackage.trh
    public final anhy e(tlg tlgVar) {
        return anfq.h(this.e.a(), new fjz(rwh.aA(tlgVar, this.a, this.b), 14), this.c);
    }

    @Override // defpackage.trh
    public final anhy f(tlg tlgVar) {
        return aney.h(anfq.h(anht.q(this.e.b(new fjz(rwh.aA(tlgVar, this.a, this.b), 15), this.c)), tqf.o, this.c), IOException.class, tqf.k, this.c);
    }

    @Override // defpackage.trh
    public final anhy g(tlg tlgVar, final tlh tlhVar) {
        final String aA = rwh.aA(tlgVar, this.a, this.b);
        return aney.h(anfq.h(anht.q(this.e.b(new amml() { // from class: tqp
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                String str = aA;
                tlh tlhVar2 = tlhVar;
                aone builder = ((tlj) obj).toBuilder();
                builder.z(str, tlhVar2);
                return (tlj) builder.build();
            }
        }, this.c)), tqf.p, this.c), IOException.class, tqf.l, this.c);
    }

    public final void h(tpr tprVar) {
        if (rwh.bf(this.a, this.b).d == tprVar.d || rwh.bh(this.a, tprVar)) {
            return;
        }
        String valueOf = String.valueOf(tprVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75);
        sb.append("Failed to commit migration version to disk. Fail to set target version to ");
        sb.append(valueOf);
        sb.append(".");
        tsx.b(sb.toString());
        tme tmeVar = this.b;
        String valueOf2 = String.valueOf(tprVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
        sb2.append("Fail to set target version ");
        sb2.append(valueOf2);
        sb2.append(".");
        tmeVar.a(new Exception(sb2.toString()), "Failed to commit migration version to disk.", new Object[0]);
    }
}
