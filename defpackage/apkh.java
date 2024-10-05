package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apkh extends aonm implements aooz {
    public static final apkh a;
    private static volatile aopf h;
    public int b;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public apki g;
    private aota i;
    private byte j = 2;
    public String c = "";

    static {
        apkh apkhVar = new apkh();
        a = apkhVar;
        aonm.registerDefaultInstance(apkh.class, apkhVar);
    }

    private apkh() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0006\u0005ဉ\u0005\bᐉ\u0002\tᐉ\u0003", new Object[]{"b", "c", "d", "i", "g", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apkh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apkh.class) {
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
