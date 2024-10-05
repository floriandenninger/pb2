package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aram extends aonm implements aooz {
    public static final aram a;
    private static volatile aopf b;
    private int c;
    private aota d;
    private aqyg e;
    private apmh f;
    private apmh g;
    private aran h;
    private byte i = 2;

    static {
        aram aramVar = new aram();
        a = aramVar;
        aonm.registerDefaultInstance(aram.class, aramVar);
    }

    private aram() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0004ᐉ\u0003\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aram();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aram.class) {
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
}
