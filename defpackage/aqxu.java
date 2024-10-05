package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqxu extends aonm implements aooz {
    public static final aqxu a;
    private static volatile aopf f;
    public int b;
    public aqyg c;
    public int e;
    private apxf g;
    private aqyg h;
    private byte i = 2;
    public String d = "";

    static {
        aqxu aqxuVar = new aqxu();
        a = aqxuVar;
        aonm.registerDefaultInstance(aqxu.class, aqxuVar);
    }

    private aqxu() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ဈ\u0001\u0004ဋ\u0003\u0007ᐉ\u0006\tᐉ\b", new Object[]{"b", "c", "d", "e", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqxu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqxu.class) {
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
