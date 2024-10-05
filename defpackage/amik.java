package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amik extends aonm implements aooz {
    public static final amik a;
    private static volatile aopf i;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public long f;
    public long g;
    public boolean h;

    static {
        amik amikVar = new amik();
        a = amikVar;
        aonm.registerDefaultInstance(amik.class, amikVar);
    }

    private amik() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new amik();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (amik.class) {
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
