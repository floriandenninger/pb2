package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awue extends aonm implements aooz {
    public static final awue a;
    public static final aonk b;
    private static volatile aopf y;
    public int c;
    public awnd d;
    public awnd e;
    public awnw f;
    public awnw g;
    public awnw h;
    public boolean i;
    public boolean j;
    public boolean l;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean w;
    public boolean x;
    private awnw z;
    private byte A = 2;
    public boolean k = true;
    public aony m = emptyProtobufList();
    public aony n = aonm.emptyProtobufList();
    public aony o = emptyProtobufList();
    public aony p = emptyProtobufList();
    public aony v = emptyProtobufList();

    static {
        awue awueVar = new awue();
        a = awueVar;
        aonm.registerDefaultInstance(awue.class, awueVar);
        b = aonm.newSingularGeneratedExtension(awqd.a, awueVar, awueVar, null, 220721894, aoqn.MESSAGE, awue.class);
    }

    private awue() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.A);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0016\u0000\u0001\u0001\u0018\u0016\u0000\u0005\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\n\u001b\u000bဇ\b\fᐉ\n\r\u001a\u000fЛ\u0010ဇ\f\u0011ဇ\r\u0012ဇ\u000e\u0013\u001b\u0014ဇ\u000f\u0015ဇ\u0010\u0016ဇ\u0011\u0017ဇ\u0012\u0018Л", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "m", awtx.class, "l", "z", "n", "p", awuc.class, "q", "r", "s", "o", awuf.class, "t", "u", "w", "x", "v", awts.class});
            case NEW_MUTABLE_INSTANCE:
                return new awue();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = y;
                if (aopfVar == null) {
                    synchronized (awue.class) {
                        aopfVar = y;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            y = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
