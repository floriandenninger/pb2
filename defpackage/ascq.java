package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ascq extends aonm implements aooz {
    public static final ascq a;
    private static volatile aopf e;
    public arnd b;
    public aulq d;
    private int f;
    private apxf g;
    private aqzg h;
    private byte i = 2;
    public aony c = emptyProtobufList();

    static {
        ascq ascqVar = new ascq();
        a = ascqVar;
        aonm.registerDefaultInstance(ascq.class, ascqVar);
    }

    private ascq() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001\u0005ᐉ\u0002̉ᐉ\u0003", new Object[]{"f", "b", "c", aulq.class, "g", "d", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ascq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (ascq.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
