package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atzo extends aonm implements aooz {
    public static final atzo a;
    private static volatile aopf d;
    public int b;
    public atzx c;
    private avos e;
    private byte f = 2;

    static {
        atzo atzoVar = new atzo();
        a = atzoVar;
        aonm.registerDefaultInstance(atzo.class, atzoVar);
    }

    private atzo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uebb2ᭁ\uf5a0濼\u0002\u0000\u0000\u0002\uebb2ᭁᐉ\u0000\uf5a0濼ᐉ\u0001", new Object[]{"b", "c", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atzo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atzo.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
