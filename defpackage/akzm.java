package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akzm extends aonm implements aooz {
    public static final akzm a;
    private static volatile aopf i;
    public int b;
    public int c;
    public String d = "";
    public long e;
    public long f;
    public long g;
    public long h;

    static {
        akzm akzmVar = new akzm();
        a = akzmVar;
        aonm.registerDefaultInstance(akzm.class, akzmVar);
    }

    private akzm() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\u0006ဃ\u0005", new Object[]{"b", "c", aduo.e, "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new akzm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (akzm.class) {
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
