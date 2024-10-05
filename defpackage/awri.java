package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awri extends aonm implements aooz {
    public static final awri a;
    public static final aonk b;
    private static volatile aopf d;
    public awrh c;
    private int e;
    private aota f;
    private awqr g;
    private awqs h;
    private awrf i;
    private awnw j;
    private awqg k;
    private awqz l;
    private awre m;
    private awnw n;
    private awnw o;
    private awqt p;
    private byte q = 2;

    static {
        awri awriVar = new awri();
        a = awriVar;
        aonm.registerDefaultInstance(awri.class, awriVar);
        b = aonm.newSingularGeneratedExtension(awog.a, awriVar, awriVar, null, 232954548, aoqn.MESSAGE, awri.class);
    }

    private awri() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0018\f\u0000\u0000\f\u0001ᐉ\u0012\u0004ᐉ\u0002\u0007ᐉ\u0014\bᐉ\u0015\fᐉ\u0017\u000eᐉ\b\u0011ᐉ\t\u0012ᐉ\u0000\u0013ᐉ\n\u0014ᐉ\u000b\u0015ᐉ\f\u0018ᐉ\u000f", new Object[]{"e", "m", "f", "n", "o", "p", "g", "h", "c", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new awri();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awri.class) {
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
