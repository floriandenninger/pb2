package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxo extends aonm implements aooz {
    public static final apxo a;
    private static volatile aopf g;
    public int b;
    public apxp c;
    public apxm d;
    public apxq e;
    public apxr f;
    private byte h = 2;

    static {
        apxo apxoVar = new apxo();
        a = apxoVar;
        aonm.registerDefaultInstance(apxo.class, apxoVar);
    }

    private apxo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ue552㰻\uedd0䲹\u0004\u0000\u0000\u0004\ue552㰻ᐉ\u0000\ue2e7㲩ᐉ\u0001\uf68b䤹ᐉ\u0002\uedd0䲹ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apxo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apxo.class) {
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
