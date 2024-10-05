package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class armb extends aonm implements aooz {
    public static final armb a;
    private static volatile aopf g;
    public int b;
    public arnd c;
    public armc d;
    public arlj f;
    private aqzg h;
    private byte i = 2;
    public aony e = emptyProtobufList();

    static {
        armb armbVar = new armb();
        a = armbVar;
        aonm.registerDefaultInstance(armb.class, armbVar);
    }

    private armb() {
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
                return new armb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (armb.class) {
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
