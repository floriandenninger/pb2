package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class argv extends aonm implements aooz {
    public static final argv a;
    private static volatile aopf h;
    public int b;
    public arhi c;
    public arhk d;
    public arhe e;
    public argq f;
    public arhg g;
    private arhc i;
    private argr j;
    private audq k;
    private byte l = 2;

    static {
        argv argvVar = new argv();
        a = argvVar;
        aonm.registerDefaultInstance(argv.class, argvVar);
    }

    private argv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001אַᶖ\ue9cd㉵\b\u0000\u0000\bאַᶖᐉ\u0000\uf743↸ᐉ\u0004\ue4d2⇋ᐉ\u0002\ue5e4⇹ᐉ\u0001\ueda2⧮ᐉ\u0003\ue6f1⽊ᐉ\u0005\uf696⽤ᐉ\u0006\ue9cd㉵ᐉ\u0007", new Object[]{"b", "c", "i", "e", "d", "f", "j", "k", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new argv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (argv.class) {
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
