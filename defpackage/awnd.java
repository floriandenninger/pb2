package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awnd extends aonm implements aooz {
    public static final awnd a;
    private static volatile aopf j;
    public int b;
    public int d;
    public awng i;
    private byte k = 2;
    public String c = "";
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();
    public aony h = emptyProtobufList();

    static {
        awnd awndVar = new awnd();
        a = awndVar;
        aonm.registerDefaultInstance(awnd.class, awndVar);
    }

    private awnd() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0004\u0004\u0001ဈ\u0000\u0003ဌ\u0002\u0005Л\u0006Л\bЛ\nЛ\u000bဉ\u0006", new Object[]{"b", "c", "d", aweb.t, "e", awne.class, "f", awnh.class, "g", awnc.class, "h", awnf.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new awnd();
            case NEW_BUILDER:
                return new aone((float[][]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (awnd.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
