package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aoln implements aoox {
    @Deprecated
    protected static void addAll(Iterable iterable, Collection collection) {
        addAll(iterable, (List) collection);
    }

    private static void addAllCheckingNulls(Iterable iterable, List list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj != null) {
                list.add(obj);
            } else {
                int size2 = list.size();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Element at index ");
                sb.append(size2 - size);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        break;
                    } else {
                        list.remove(size3);
                    }
                }
                throw new NullPointerException(sb2);
            }
        }
    }

    private String getReadingExceptionMessage(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length());
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aoqb newUninitializedMessageException(aooy aooyVar) {
        return new aoqb();
    }

    @Override // 
    /* renamed from: clone */
    public abstract aoln mo21clone();

    protected abstract aoln internalMergeFrom(aolo aoloVar);

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, aomw.a());
    }

    @Override // defpackage.aoox
    public aoln mergeFrom(aomf aomfVar) {
        try {
            aomk l = aomfVar.l();
            m23mergeFrom(l);
            l.B(0);
            return this;
        } catch (aoob e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    @Override // 
    /* renamed from: mergeFrom */
    public abstract aoln mo24mergeFrom(aomk aomkVar, aomw aomwVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public static void addAll(Iterable iterable, List list) {
        aonz.h(iterable);
        if (iterable instanceof aooj) {
            List h = ((aooj) iterable).h();
            aooj aoojVar = (aooj) list;
            int size = list.size();
            for (Object obj : h) {
                if (obj != null) {
                    if (obj instanceof aomf) {
                        aoojVar.i((aomf) obj);
                    } else {
                        aoojVar.add((String) obj);
                    }
                } else {
                    int size2 = aoojVar.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = aoojVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        } else {
                            aoojVar.remove(size3);
                        }
                    }
                    throw new NullPointerException(sb2);
                }
            }
            return;
        }
        if (iterable instanceof aopg) {
            list.addAll((Collection) iterable);
        } else {
            addAllCheckingNulls(iterable, list);
        }
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, aomw aomwVar) {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        m26mergeFrom((InputStream) new aolm(inputStream, aomk.K(read, inputStream)), aomwVar);
        return true;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aoln m22mergeFrom(aomf aomfVar, aomw aomwVar) {
        try {
            aomk l = aomfVar.l();
            mo24mergeFrom(l, aomwVar);
            l.B(0);
            return this;
        } catch (aoob e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aoln m23mergeFrom(aomk aomkVar) {
        return mo24mergeFrom(aomkVar, aomw.a());
    }

    @Override // defpackage.aoox
    public aoln mergeFrom(aooy aooyVar) {
        if (!getDefaultInstanceForType().getClass().isInstance(aooyVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return internalMergeFrom((aolo) aooyVar);
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aoln m25mergeFrom(InputStream inputStream) {
        aomk M = aomk.M(inputStream);
        m23mergeFrom(M);
        M.B(0);
        return this;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public aoln m26mergeFrom(InputStream inputStream, aomw aomwVar) {
        aomk M = aomk.M(inputStream);
        mo24mergeFrom(M, aomwVar);
        M.B(0);
        return this;
    }

    @Override // defpackage.aoox
    public aoln mergeFrom(byte[] bArr) {
        return mo27mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: mergeFrom */
    public aoln mo27mergeFrom(byte[] bArr, int i, int i2) {
        try {
            aomk Q = aomk.Q(bArr, i, i2);
            m23mergeFrom(Q);
            Q.B(0);
            return this;
        } catch (aoob e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    @Override // 
    /* renamed from: mergeFrom */
    public aoln mo28mergeFrom(byte[] bArr, int i, int i2, aomw aomwVar) {
        try {
            aomk Q = aomk.Q(bArr, i, i2);
            mo24mergeFrom(Q, aomwVar);
            Q.B(0);
            return this;
        } catch (aoob e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    @Override // defpackage.aoox
    public aoln mergeFrom(byte[] bArr, aomw aomwVar) {
        return mo28mergeFrom(bArr, 0, bArr.length, aomwVar);
    }
}
