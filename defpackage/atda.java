package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atda extends aonm implements aooz {
    public static final atda a;
    private static volatile aopf q;
    public int b;
    public atdb c;
    public atde d;
    public atdd e;
    public atdk f;
    public atcw g;
    public atcx h;
    public atdj i;
    public avqw j;
    public avqx k;
    public atdg l;
    public avpw m;
    public atcs n;
    public auxn o;
    public aqrf p;
    private byte r = 2;

    static {
        atda atdaVar = new atda();
        a = atdaVar;
        aonm.registerDefaultInstance(atda.class, atdaVar);
    }

    private atda() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\uef94ᾮ\uf7d1ꂤ\u000e\u0000\u0000\u000e\uef94ᾮᐉ\u0000\uefc3ᾮᐉ\u0001ﶃⓖᐉ\u0005\ueea7ⓗᐉ\u0004\uf42d▚ᐉ\u0003\uf492䤳ᐉ\r\ue8e7䴓ᐉ\u0006\uf389櫀ᐉ\u0007﹉淹ᐉ\bﺥ瓧ᐉ\t\uea03磭ᐉ\n\ue957茥ᐉ\u000b\uef21队ᐉ\f\uf7d1ꂤᐉ\u0002", new Object[]{"b", "c", "d", "h", "g", "f", "p", "i", "j", "k", "l", "m", "n", "o", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atda();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (atda.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
