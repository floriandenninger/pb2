package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avmg extends aonm implements aooz {
    public static final avmg a;
    private static volatile aopf d;
    public avmf b;
    public avmm c;
    private int e;
    private aota f;
    private byte g = 2;

    static {
        avmg avmgVar = new avmg();
        a = avmgVar;
        aonm.registerDefaultInstance(avmg.class, avmgVar);
    }

    private avmg() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0001\u0003ᐉ\u0003\u0005ᐉ\u0000", new Object[]{"e", "c", "f", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new avmg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avmg.class) {
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
