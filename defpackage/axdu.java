package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axdu extends aonm implements aooz {
    private static final axdu a;
    private static volatile aopf b;
    private int c;
    private aony d = emptyProtobufList();
    private aony e = emptyProtobufList();
    private boolean f;

    static {
        axdu axduVar = new axdu();
        a = axduVar;
        aonm.registerDefaultInstance(axdu.class, axduVar);
    }

    private axdu() {
    }

    public static axdu c() {
        return a;
    }

    public static axdu d(byte[] bArr, aomw aomwVar) {
        return (axdu) aonm.parseFrom(a, bArr, aomwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.c &= -2;
        this.f = false;
    }

    public int a() {
        return this.d.size();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဇ\u0000", new Object[]{"c", "d", axdk.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new axdu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axdu.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public List e() {
        return this.d;
    }

    public boolean g() {
        return this.f;
    }
}
