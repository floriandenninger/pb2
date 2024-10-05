package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ased extends aonm implements aooz {
    public static final ased a;
    private static volatile aopf f;
    public arnd b;
    private int g;
    private aulq h;
    private aota i;
    private byte j = 2;
    public aony c = emptyProtobufList();
    public String d = "";
    public aomf e = aomf.b;

    static {
        ased asedVar = new ased();
        a = asedVar;
        aonm.registerDefaultInstance(ased.class, asedVar);
    }

    private ased() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0004\u0004ည\u0005\u0005ဈ\u0001\u0006ᐉ\u0002", new Object[]{"g", "b", "c", aulq.class, "i", "e", "d", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ased();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ased.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
