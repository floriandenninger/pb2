package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxq extends aonm implements aooz {
    public static final apxq a;
    private static volatile aopf g;
    public int b;
    public Object d;
    public apxn f;
    public int c = 0;
    private byte h = 2;
    public String e = "";

    static {
        apxq apxqVar = new apxq();
        a = apxqVar;
        aonm.registerDefaultInstance(apxq.class, apxqVar);
    }

    private apxq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐼ\u0000\u0003ဉ\u0003\u0004ᐼ\u0000\u0005ဈ\u0002", new Object[]{"d", "c", "b", arfs.class, "f", avgg.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apxq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apxq.class) {
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
