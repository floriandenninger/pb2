package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apiv extends aonm implements aooz {
    public static final apiv a;
    private static volatile aopf i;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;

    static {
        apiv apivVar = new apiv();
        a = apivVar;
        aonm.registerDefaultInstance(apiv.class, apivVar);
    }

    private apiv() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0002\u0003င\u0003\u0004င\u0004\u0005ဌ\u0001\u0006င\u0005", new Object[]{"b", "c", apew.p, "e", "f", "g", "d", apew.q, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apiv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (apiv.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
