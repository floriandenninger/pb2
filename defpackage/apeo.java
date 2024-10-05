package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apeo extends aonm implements aooz {
    public static final apeo a;
    private static volatile aopf v;
    public int b;
    public Object d;
    public apek e;
    public apxf f;
    public apxf g;
    public apxf h;
    public apxf i;
    public apxf j;
    public aovq o;
    public int p;
    public avpy q;
    public int r;
    public aulq s;
    public atnb t;
    public asuh u;
    public int c = 0;
    private byte w = 2;
    public aony k = emptyProtobufList();
    public aony l = emptyProtobufList();
    public aony m = emptyProtobufList();
    public aonx n = emptyLongList();

    static {
        apeo apeoVar = new apeo();
        a = apeoVar;
        aonm.registerDefaultInstance(apeo.class, apeoVar);
    }

    private apeo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.w);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0012\u0001\u0001\u0001ϧ\u0012\u0000\u0004\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005Л\u0006Л\b\u0014\nᐉ\u0006\u0011ᐼ\u0000\u0012ဌ\t\u0016ᐉ\u0005\u0018ဉ\n\u001aင\u000b\u001bᐉ\u0002\u001cЛ\u001dᐉ\f!ဉ\u000eϧᐉ\u000f", new Object[]{"d", "c", "b", "e", "f", "h", "i", "k", apen.class, "l", apxf.class, "n", "o", apel.class, "p", apem.a(), "j", "q", "r", "g", "m", apxf.class, "s", "t", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new apeo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = v;
                if (aopfVar == null) {
                    synchronized (apeo.class) {
                        aopfVar = v;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            v = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
