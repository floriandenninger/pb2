package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxa extends aonm implements aooz {
    public static final apxa a;
    private static volatile aopf i;
    public int b;
    public avgg c;
    public apxb d;
    public apwz e;
    public boolean h;
    private aota j;
    private byte k = 2;
    public aony f = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        apxa apxaVar = new apxa();
        a = apxaVar;
        aonm.registerDefaultInstance(apxa.class, apxaVar);
    }

    private apxa() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004\u001b\u0005ᐉ\u0003\u0006ည\u0004\bဇ\u0005", new Object[]{"b", "c", "d", "e", "f", aown.class, "j", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apxa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (apxa.class) {
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
