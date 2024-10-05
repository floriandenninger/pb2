package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class armi extends aonm implements aooz {
    public static final armi a;
    private static volatile aopf g;
    public int b;
    public arnd c;
    public armj d;
    public arlj f;
    private aqzg h;
    private byte i = 2;
    public aony e = emptyProtobufList();

    static {
        armi armiVar = new armi();
        a = armiVar;
        aonm.registerDefaultInstance(armi.class, armiVar);
    }

    private armi() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004Л\u0005ᐉ\u0002̉ᐉ\u0003", new Object[]{"b", "c", "d", "e", apxf.class, "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new armi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (armi.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
