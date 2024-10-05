package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apob extends aonm implements aooz {
    public static final apob a;
    private static volatile aopf h;
    public int b;
    public Object d;
    public avgg e;
    public int f;
    public int g;
    public int c = 0;
    private byte i = 2;

    static {
        apob apobVar = new apob();
        a = apobVar;
        aonm.registerDefaultInstance(apob.class, apobVar);
    }

    private apob() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐉ\u0002\u0004င\u0004\u0005င\u0005\u0006ᐼ\u0000", new Object[]{"d", "c", "b", avgg.class, "e", "f", "g", apnx.class});
            case NEW_MUTABLE_INSTANCE:
                return new apob();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apob.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
